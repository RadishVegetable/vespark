package com.veg.vespark.parser;

import com.veg.vespark.codegen.VeSqlBaseLexer;
import com.veg.vespark.codegen.VeSqlBaseParser;
import com.veg.vespark.plans.logical.LogicalPlan;
import com.veg.vespark.trees.TreeNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SqlParser {
    private static final Logger LOGGER = LoggerFactory.getLogger(SqlParser.class);

    private VeSqlBaseParser parse(String sqlText) {
        LOGGER.debug("Parsing sql: {}",sqlText);
        VeSqlBaseLexer lexer = new VeSqlBaseLexer(new UpperCaseCharStream(CharStreams.fromString(sqlText)));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        VeSqlBaseParser parser = new VeSqlBaseParser(tokenStream);
        parser.removeErrorListeners();
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
                return parser;
            } catch (ParseCancellationException e){
                    // if we fail, parse with LL mode
                    tokenStream.seek(0); // rewind input stream
                    parser.reset();

                    // Try Again.
                    parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                    return parser;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public LogicalPlan parsePlan(String sqlText) {
        VeSqlBaseParser parser = parse(sqlText);
        return (LogicalPlan) new AstBuilder().visitSingleStatement(parser.singleStatement());
    }
}
