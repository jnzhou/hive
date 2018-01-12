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
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class Decimal implements org.apache.thrift.TBase<Decimal, Decimal._Fields>, java.io.Serializable, Cloneable, Comparable<Decimal> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Decimal");

  private static final org.apache.thrift.protocol.TField UNSCALED_FIELD_DESC = new org.apache.thrift.protocol.TField("unscaled", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("scale", org.apache.thrift.protocol.TType.I16, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DecimalStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DecimalTupleSchemeFactory());
  }

  private ByteBuffer unscaled; // required
  private short scale; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UNSCALED((short)1, "unscaled"),
    SCALE((short)3, "scale");

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
        case 1: // UNSCALED
          return UNSCALED;
        case 3: // SCALE
          return SCALE;
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
  private static final int __SCALE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UNSCALED, new org.apache.thrift.meta_data.FieldMetaData("unscaled", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SCALE, new org.apache.thrift.meta_data.FieldMetaData("scale", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Decimal.class, metaDataMap);
  }

  public Decimal() {
  }

  public Decimal(
    ByteBuffer unscaled,
    short scale)
  {
    this();
    this.unscaled = org.apache.thrift.TBaseHelper.copyBinary(unscaled);
    this.scale = scale;
    setScaleIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Decimal(Decimal other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUnscaled()) {
      this.unscaled = org.apache.thrift.TBaseHelper.copyBinary(other.unscaled);
    }
    this.scale = other.scale;
  }

  public Decimal deepCopy() {
    return new Decimal(this);
  }

  @Override
  public void clear() {
    this.unscaled = null;
    setScaleIsSet(false);
    this.scale = 0;
  }

  public byte[] getUnscaled() {
    setUnscaled(org.apache.thrift.TBaseHelper.rightSize(unscaled));
    return unscaled == null ? null : unscaled.array();
  }

  public ByteBuffer bufferForUnscaled() {
    return org.apache.thrift.TBaseHelper.copyBinary(unscaled);
  }

  public void setUnscaled(byte[] unscaled) {
    this.unscaled = unscaled == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(unscaled, unscaled.length));
  }

  public void setUnscaled(ByteBuffer unscaled) {
    this.unscaled = org.apache.thrift.TBaseHelper.copyBinary(unscaled);
  }

  public void unsetUnscaled() {
    this.unscaled = null;
  }

  /** Returns true if field unscaled is set (has been assigned a value) and false otherwise */
  public boolean isSetUnscaled() {
    return this.unscaled != null;
  }

  public void setUnscaledIsSet(boolean value) {
    if (!value) {
      this.unscaled = null;
    }
  }

  public short getScale() {
    return this.scale;
  }

  public void setScale(short scale) {
    this.scale = scale;
    setScaleIsSet(true);
  }

  public void unsetScale() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  /** Returns true if field scale is set (has been assigned a value) and false otherwise */
  public boolean isSetScale() {
    return EncodingUtils.testBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  public void setScaleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCALE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UNSCALED:
      if (value == null) {
        unsetUnscaled();
      } else {
        setUnscaled((ByteBuffer)value);
      }
      break;

    case SCALE:
      if (value == null) {
        unsetScale();
      } else {
        setScale((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UNSCALED:
      return getUnscaled();

    case SCALE:
      return getScale();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UNSCALED:
      return isSetUnscaled();
    case SCALE:
      return isSetScale();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Decimal)
      return this.equals((Decimal)that);
    return false;
  }

  public boolean equals(Decimal that) {
    if (that == null)
      return false;

    boolean this_present_unscaled = true && this.isSetUnscaled();
    boolean that_present_unscaled = true && that.isSetUnscaled();
    if (this_present_unscaled || that_present_unscaled) {
      if (!(this_present_unscaled && that_present_unscaled))
        return false;
      if (!this.unscaled.equals(that.unscaled))
        return false;
    }

    boolean this_present_scale = true;
    boolean that_present_scale = true;
    if (this_present_scale || that_present_scale) {
      if (!(this_present_scale && that_present_scale))
        return false;
      if (this.scale != that.scale)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_unscaled = true && (isSetUnscaled());
    list.add(present_unscaled);
    if (present_unscaled)
      list.add(unscaled);

    boolean present_scale = true;
    list.add(present_scale);
    if (present_scale)
      list.add(scale);

    return list.hashCode();
  }

  @Override
  public int compareTo(Decimal other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUnscaled()).compareTo(other.isSetUnscaled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnscaled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unscaled, other.unscaled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScale()).compareTo(other.isSetScale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scale, other.scale);
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
    StringBuilder sb = new StringBuilder("Decimal(");
    boolean first = true;

    sb.append("unscaled:");
    if (this.unscaled == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.unscaled, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("scale:");
    sb.append(this.scale);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetUnscaled()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'unscaled' is unset! Struct:" + toString());
    }

    if (!isSetScale()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scale' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DecimalStandardSchemeFactory implements SchemeFactory {
    public DecimalStandardScheme getScheme() {
      return new DecimalStandardScheme();
    }
  }

  private static class DecimalStandardScheme extends StandardScheme<Decimal> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Decimal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UNSCALED
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.unscaled = iprot.readBinary();
              struct.setUnscaledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.scale = iprot.readI16();
              struct.setScaleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Decimal struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.unscaled != null) {
        oprot.writeFieldBegin(UNSCALED_FIELD_DESC);
        oprot.writeBinary(struct.unscaled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SCALE_FIELD_DESC);
      oprot.writeI16(struct.scale);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DecimalTupleSchemeFactory implements SchemeFactory {
    public DecimalTupleScheme getScheme() {
      return new DecimalTupleScheme();
    }
  }

  private static class DecimalTupleScheme extends TupleScheme<Decimal> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Decimal struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.unscaled);
      oprot.writeI16(struct.scale);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Decimal struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.unscaled = iprot.readBinary();
      struct.setUnscaledIsSet(true);
      struct.scale = iprot.readI16();
      struct.setScaleIsSet(true);
    }
  }

}

