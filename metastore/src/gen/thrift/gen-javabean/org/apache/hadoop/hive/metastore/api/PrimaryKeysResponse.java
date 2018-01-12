/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class PrimaryKeysResponse implements org.apache.thrift.TBase<PrimaryKeysResponse, PrimaryKeysResponse._Fields>, java.io.Serializable, Cloneable, Comparable<PrimaryKeysResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrimaryKeysResponse");

  private static final org.apache.thrift.protocol.TField PRIMARY_KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("primaryKeys", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PrimaryKeysResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PrimaryKeysResponseTupleSchemeFactory());
  }

  private List<SQLPrimaryKey> primaryKeys; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIMARY_KEYS((short)1, "primaryKeys");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRIMARY_KEYS
          return PRIMARY_KEYS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIMARY_KEYS, new org.apache.thrift.meta_data.FieldMetaData("primaryKeys", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLPrimaryKey.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrimaryKeysResponse.class, metaDataMap);
  }

  public PrimaryKeysResponse() {
  }

  public PrimaryKeysResponse(
    List<SQLPrimaryKey> primaryKeys)
  {
    this();
    this.primaryKeys = primaryKeys;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrimaryKeysResponse(PrimaryKeysResponse other) {
    if (other.isSetPrimaryKeys()) {
      List<SQLPrimaryKey> __this__primaryKeys = new ArrayList<SQLPrimaryKey>(other.primaryKeys.size());
      for (SQLPrimaryKey other_element : other.primaryKeys) {
        __this__primaryKeys.add(new SQLPrimaryKey(other_element));
      }
      this.primaryKeys = __this__primaryKeys;
    }
  }

  public PrimaryKeysResponse deepCopy() {
    return new PrimaryKeysResponse(this);
  }

  @Override
  public void clear() {
    this.primaryKeys = null;
  }

  public int getPrimaryKeysSize() {
    return (this.primaryKeys == null) ? 0 : this.primaryKeys.size();
  }

  public java.util.Iterator<SQLPrimaryKey> getPrimaryKeysIterator() {
    return (this.primaryKeys == null) ? null : this.primaryKeys.iterator();
  }

  public void addToPrimaryKeys(SQLPrimaryKey elem) {
    if (this.primaryKeys == null) {
      this.primaryKeys = new ArrayList<SQLPrimaryKey>();
    }
    this.primaryKeys.add(elem);
  }

  public List<SQLPrimaryKey> getPrimaryKeys() {
    return this.primaryKeys;
  }

  public void setPrimaryKeys(List<SQLPrimaryKey> primaryKeys) {
    this.primaryKeys = primaryKeys;
  }

  public void unsetPrimaryKeys() {
    this.primaryKeys = null;
  }

  /** Returns true if field primaryKeys is set (has been assigned a value) and false otherwise */
  public boolean isSetPrimaryKeys() {
    return this.primaryKeys != null;
  }

  public void setPrimaryKeysIsSet(boolean value) {
    if (!value) {
      this.primaryKeys = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRIMARY_KEYS:
      if (value == null) {
        unsetPrimaryKeys();
      } else {
        setPrimaryKeys((List<SQLPrimaryKey>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIMARY_KEYS:
      return getPrimaryKeys();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRIMARY_KEYS:
      return isSetPrimaryKeys();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PrimaryKeysResponse)
      return this.equals((PrimaryKeysResponse)that);
    return false;
  }

  public boolean equals(PrimaryKeysResponse that) {
    if (that == null)
      return false;

    boolean this_present_primaryKeys = true && this.isSetPrimaryKeys();
    boolean that_present_primaryKeys = true && that.isSetPrimaryKeys();
    if (this_present_primaryKeys || that_present_primaryKeys) {
      if (!(this_present_primaryKeys && that_present_primaryKeys))
        return false;
      if (!this.primaryKeys.equals(that.primaryKeys))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_primaryKeys = true && (isSetPrimaryKeys());
    list.add(present_primaryKeys);
    if (present_primaryKeys)
      list.add(primaryKeys);

    return list.hashCode();
  }

  @Override
  public int compareTo(PrimaryKeysResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPrimaryKeys()).compareTo(other.isSetPrimaryKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrimaryKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.primaryKeys, other.primaryKeys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PrimaryKeysResponse(");
    boolean first = true;

    sb.append("primaryKeys:");
    if (this.primaryKeys == null) {
      sb.append("null");
    } else {
      sb.append(this.primaryKeys);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPrimaryKeys()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'primaryKeys' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrimaryKeysResponseStandardSchemeFactory implements SchemeFactory {
    public PrimaryKeysResponseStandardScheme getScheme() {
      return new PrimaryKeysResponseStandardScheme();
    }
  }

  private static class PrimaryKeysResponseStandardScheme extends StandardScheme<PrimaryKeysResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PrimaryKeysResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIMARY_KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list322 = iprot.readListBegin();
                struct.primaryKeys = new ArrayList<SQLPrimaryKey>(_list322.size);
                SQLPrimaryKey _elem323;
                for (int _i324 = 0; _i324 < _list322.size; ++_i324)
                {
                  _elem323 = new SQLPrimaryKey();
                  _elem323.read(iprot);
                  struct.primaryKeys.add(_elem323);
                }
                iprot.readListEnd();
              }
              struct.setPrimaryKeysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PrimaryKeysResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.primaryKeys != null) {
        oprot.writeFieldBegin(PRIMARY_KEYS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.primaryKeys.size()));
          for (SQLPrimaryKey _iter325 : struct.primaryKeys)
          {
            _iter325.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrimaryKeysResponseTupleSchemeFactory implements SchemeFactory {
    public PrimaryKeysResponseTupleScheme getScheme() {
      return new PrimaryKeysResponseTupleScheme();
    }
  }

  private static class PrimaryKeysResponseTupleScheme extends TupleScheme<PrimaryKeysResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrimaryKeysResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.primaryKeys.size());
        for (SQLPrimaryKey _iter326 : struct.primaryKeys)
        {
          _iter326.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrimaryKeysResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list327 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.primaryKeys = new ArrayList<SQLPrimaryKey>(_list327.size);
        SQLPrimaryKey _elem328;
        for (int _i329 = 0; _i329 < _list327.size; ++_i329)
        {
          _elem328 = new SQLPrimaryKey();
          _elem328.read(iprot);
          struct.primaryKeys.add(_elem328);
        }
      }
      struct.setPrimaryKeysIsSet(true);
    }
  }

}

