package com.veg.vespark.catalyst.storage;

import com.veg.vespark.catalyst.storage.field.BooleanField;
import com.veg.vespark.catalyst.storage.field.Field;
import com.veg.vespark.catalyst.storage.common.Type;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Tuple maintains information about the contents of a tuple. Tuples have a
 * specified schema specified by a TupleDesc object and contain Field objects
 * with the data for each field.
 */
public class Tuple implements Serializable {
    private static final long serialVersionUID = 1L;

    private static Tuple TRUE_TUPLE;
    private static Tuple FALSE_TUPLE;
    // 元数据
    private TupleDesc tupleDesc;
    // 每一列的数据
    private Field[] fields;
    private RecordId recordId;

    /**
     * Create a new tuple with the specified schema (type).
     *
     * @param td the schema of this tuple. It must be a valid TupleDesc
     *           instance with at least one field.
     */
    public Tuple(TupleDesc td) {
        // some code goes here
        this.tupleDesc = td;
        this.fields = new Field[this.tupleDesc.numFields()];
    }

    public Tuple(Type type, String fieldName, Field f) {
        this(new TupleDesc(new Type[]{type}, new String[]{fieldName}));
        setField(0, f);
    }

    /**
     * @return The TupleDesc representing the schema of this tuple.
     */
    public TupleDesc getTupleDesc() {
        // some code goes here
        return this.tupleDesc;
    }

    /**
     * @return The RecordId representing the location of this tuple on disk. May
     * be null.
     */
    public RecordId getRecordId() {
        // some code goes here
        return this.recordId;
    }

    /**
     * Set the RecordId information for this tuple.
     *
     * @param rid the new RecordId for this tuple.
     */
    public void setRecordId(RecordId rid) {
        // some code goes here
        this.recordId = rid;
    }

    /**
     * Change the value of the ith field of this tuple.
     *
     * @param i index of the field to change. It must be a valid index.
     * @param f new value for the field.
     */
    public void setField(int i, Field f) {
        // some code goes here
        if (i >= this.tupleDesc.numFields()) {
            return;
        }
        this.fields[i] = f;
    }

    /**
     * @param i field index to return. Must be a valid index.
     * @return the value of the ith field, or null if it has not been set.
     */
    public Field getField(int i) {
        // some code goes here
        if (i >= this.tupleDesc.numFields()) {
            return null;
        }
        return this.fields[i];
    }

    /**
     * Returns the contents of this Tuple as a string. Note that to pass the
     * system tests, the format needs to be as follows:
     * <p>
     * column1\tcolumn2\tcolumn3\t...\tcolumnN
     * <p>
     * where \t is any whitespace (except a newline)
     */
    @Override
    public String toString() {
        return "Tuple{" + "tupleDesc=" + tupleDesc + ", fields=" + Arrays.toString(fields) + ", recordId=" + recordId
                + '}';
    }

    /**
     * @return An iterator which iterates over all the fields of this tuple
     */
    public Iterator<Field> fields() {
        // some code goes here

        return new IteratorWrapper<>(this.fields);
    }

    /**
     * reset the TupleDesc of this tuple (only affecting the TupleDesc)
     */
    public void resetTupleDesc(TupleDesc td) {
        // some code goes here
        this.tupleDesc = td;
    }

    public static Tuple getBooleanInstance(boolean value) {
        if (value) {
            if (TRUE_TUPLE == null) {
                TRUE_TUPLE = new Tuple(Type.BOOLEAN_TYPE, "TRUE_TUPLE", new BooleanField(true));
            }
            return TRUE_TUPLE;
        } else {
            if (FALSE_TUPLE == null) {
                FALSE_TUPLE = new Tuple(Type.BOOLEAN_TYPE, "FALSE_TUPLE", new BooleanField(false));
            }
            return FALSE_TUPLE;
        }
    }
}
