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
@org.apache.hadoop.hive.common.classification.InterfaceAudience.Public @org.apache.hadoop.hive.common.classification.InterfaceStability.Stable public class GrantRevokeRoleRequest implements org.apache.thrift.TBase<GrantRevokeRoleRequest, GrantRevokeRoleRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GrantRevokeRoleRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GrantRevokeRoleRequest");

  private static final org.apache.thrift.protocol.TField REQUEST_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("requestType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRINCIPAL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("principalName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PRINCIPAL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("principalType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField GRANTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("grantor", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField GRANTOR_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("grantorType", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField GRANT_OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("grantOption", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GrantRevokeRoleRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GrantRevokeRoleRequestTupleSchemeFactory());
  }

  private GrantRevokeType requestType; // required
  private String roleName; // required
  private String principalName; // required
  private PrincipalType principalType; // required
  private String grantor; // optional
  private PrincipalType grantorType; // optional
  private boolean grantOption; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see GrantRevokeType
     */
    REQUEST_TYPE((short)1, "requestType"),
    ROLE_NAME((short)2, "roleName"),
    PRINCIPAL_NAME((short)3, "principalName"),
    /**
     * 
     * @see PrincipalType
     */
    PRINCIPAL_TYPE((short)4, "principalType"),
    GRANTOR((short)5, "grantor"),
    /**
     * 
     * @see PrincipalType
     */
    GRANTOR_TYPE((short)6, "grantorType"),
    GRANT_OPTION((short)7, "grantOption");

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
        case 1: // REQUEST_TYPE
          return REQUEST_TYPE;
        case 2: // ROLE_NAME
          return ROLE_NAME;
        case 3: // PRINCIPAL_NAME
          return PRINCIPAL_NAME;
        case 4: // PRINCIPAL_TYPE
          return PRINCIPAL_TYPE;
        case 5: // GRANTOR
          return GRANTOR;
        case 6: // GRANTOR_TYPE
          return GRANTOR_TYPE;
        case 7: // GRANT_OPTION
          return GRANT_OPTION;
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
  private static final int __GRANTOPTION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.GRANTOR,_Fields.GRANTOR_TYPE,_Fields.GRANT_OPTION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST_TYPE, new org.apache.thrift.meta_data.FieldMetaData("requestType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GrantRevokeType.class)));
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRINCIPAL_NAME, new org.apache.thrift.meta_data.FieldMetaData("principalName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRINCIPAL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("principalType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PrincipalType.class)));
    tmpMap.put(_Fields.GRANTOR, new org.apache.thrift.meta_data.FieldMetaData("grantor", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GRANTOR_TYPE, new org.apache.thrift.meta_data.FieldMetaData("grantorType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PrincipalType.class)));
    tmpMap.put(_Fields.GRANT_OPTION, new org.apache.thrift.meta_data.FieldMetaData("grantOption", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GrantRevokeRoleRequest.class, metaDataMap);
  }

  public GrantRevokeRoleRequest() {
  }

  public GrantRevokeRoleRequest(
    GrantRevokeType requestType,
    String roleName,
    String principalName,
    PrincipalType principalType)
  {
    this();
    this.requestType = requestType;
    this.roleName = roleName;
    this.principalName = principalName;
    this.principalType = principalType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GrantRevokeRoleRequest(GrantRevokeRoleRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRequestType()) {
      this.requestType = other.requestType;
    }
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    if (other.isSetPrincipalName()) {
      this.principalName = other.principalName;
    }
    if (other.isSetPrincipalType()) {
      this.principalType = other.principalType;
    }
    if (other.isSetGrantor()) {
      this.grantor = other.grantor;
    }
    if (other.isSetGrantorType()) {
      this.grantorType = other.grantorType;
    }
    this.grantOption = other.grantOption;
  }

  public GrantRevokeRoleRequest deepCopy() {
    return new GrantRevokeRoleRequest(this);
  }

  @Override
  public void clear() {
    this.requestType = null;
    this.roleName = null;
    this.principalName = null;
    this.principalType = null;
    this.grantor = null;
    this.grantorType = null;
    setGrantOptionIsSet(false);
    this.grantOption = false;
  }

  /**
   * 
   * @see GrantRevokeType
   */
  public GrantRevokeType getRequestType() {
    return this.requestType;
  }

  /**
   * 
   * @see GrantRevokeType
   */
  public void setRequestType(GrantRevokeType requestType) {
    this.requestType = requestType;
  }

  public void unsetRequestType() {
    this.requestType = null;
  }

  /** Returns true if field requestType is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestType() {
    return this.requestType != null;
  }

  public void setRequestTypeIsSet(boolean value) {
    if (!value) {
      this.requestType = null;
    }
  }

  public String getRoleName() {
    return this.roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public String getPrincipalName() {
    return this.principalName;
  }

  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }

  public void unsetPrincipalName() {
    this.principalName = null;
  }

  /** Returns true if field principalName is set (has been assigned a value) and false otherwise */
  public boolean isSetPrincipalName() {
    return this.principalName != null;
  }

  public void setPrincipalNameIsSet(boolean value) {
    if (!value) {
      this.principalName = null;
    }
  }

  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType getPrincipalType() {
    return this.principalType;
  }

  /**
   * 
   * @see PrincipalType
   */
  public void setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
  }

  public void unsetPrincipalType() {
    this.principalType = null;
  }

  /** Returns true if field principalType is set (has been assigned a value) and false otherwise */
  public boolean isSetPrincipalType() {
    return this.principalType != null;
  }

  public void setPrincipalTypeIsSet(boolean value) {
    if (!value) {
      this.principalType = null;
    }
  }

  public String getGrantor() {
    return this.grantor;
  }

  public void setGrantor(String grantor) {
    this.grantor = grantor;
  }

  public void unsetGrantor() {
    this.grantor = null;
  }

  /** Returns true if field grantor is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantor() {
    return this.grantor != null;
  }

  public void setGrantorIsSet(boolean value) {
    if (!value) {
      this.grantor = null;
    }
  }

  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType getGrantorType() {
    return this.grantorType;
  }

  /**
   * 
   * @see PrincipalType
   */
  public void setGrantorType(PrincipalType grantorType) {
    this.grantorType = grantorType;
  }

  public void unsetGrantorType() {
    this.grantorType = null;
  }

  /** Returns true if field grantorType is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantorType() {
    return this.grantorType != null;
  }

  public void setGrantorTypeIsSet(boolean value) {
    if (!value) {
      this.grantorType = null;
    }
  }

  public boolean isGrantOption() {
    return this.grantOption;
  }

  public void setGrantOption(boolean grantOption) {
    this.grantOption = grantOption;
    setGrantOptionIsSet(true);
  }

  public void unsetGrantOption() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GRANTOPTION_ISSET_ID);
  }

  /** Returns true if field grantOption is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantOption() {
    return EncodingUtils.testBit(__isset_bitfield, __GRANTOPTION_ISSET_ID);
  }

  public void setGrantOptionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GRANTOPTION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST_TYPE:
      if (value == null) {
        unsetRequestType();
      } else {
        setRequestType((GrantRevokeType)value);
      }
      break;

    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case PRINCIPAL_NAME:
      if (value == null) {
        unsetPrincipalName();
      } else {
        setPrincipalName((String)value);
      }
      break;

    case PRINCIPAL_TYPE:
      if (value == null) {
        unsetPrincipalType();
      } else {
        setPrincipalType((PrincipalType)value);
      }
      break;

    case GRANTOR:
      if (value == null) {
        unsetGrantor();
      } else {
        setGrantor((String)value);
      }
      break;

    case GRANTOR_TYPE:
      if (value == null) {
        unsetGrantorType();
      } else {
        setGrantorType((PrincipalType)value);
      }
      break;

    case GRANT_OPTION:
      if (value == null) {
        unsetGrantOption();
      } else {
        setGrantOption((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_TYPE:
      return getRequestType();

    case ROLE_NAME:
      return getRoleName();

    case PRINCIPAL_NAME:
      return getPrincipalName();

    case PRINCIPAL_TYPE:
      return getPrincipalType();

    case GRANTOR:
      return getGrantor();

    case GRANTOR_TYPE:
      return getGrantorType();

    case GRANT_OPTION:
      return isGrantOption();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_TYPE:
      return isSetRequestType();
    case ROLE_NAME:
      return isSetRoleName();
    case PRINCIPAL_NAME:
      return isSetPrincipalName();
    case PRINCIPAL_TYPE:
      return isSetPrincipalType();
    case GRANTOR:
      return isSetGrantor();
    case GRANTOR_TYPE:
      return isSetGrantorType();
    case GRANT_OPTION:
      return isSetGrantOption();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GrantRevokeRoleRequest)
      return this.equals((GrantRevokeRoleRequest)that);
    return false;
  }

  public boolean equals(GrantRevokeRoleRequest that) {
    if (that == null)
      return false;

    boolean this_present_requestType = true && this.isSetRequestType();
    boolean that_present_requestType = true && that.isSetRequestType();
    if (this_present_requestType || that_present_requestType) {
      if (!(this_present_requestType && that_present_requestType))
        return false;
      if (!this.requestType.equals(that.requestType))
        return false;
    }

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_principalName = true && this.isSetPrincipalName();
    boolean that_present_principalName = true && that.isSetPrincipalName();
    if (this_present_principalName || that_present_principalName) {
      if (!(this_present_principalName && that_present_principalName))
        return false;
      if (!this.principalName.equals(that.principalName))
        return false;
    }

    boolean this_present_principalType = true && this.isSetPrincipalType();
    boolean that_present_principalType = true && that.isSetPrincipalType();
    if (this_present_principalType || that_present_principalType) {
      if (!(this_present_principalType && that_present_principalType))
        return false;
      if (!this.principalType.equals(that.principalType))
        return false;
    }

    boolean this_present_grantor = true && this.isSetGrantor();
    boolean that_present_grantor = true && that.isSetGrantor();
    if (this_present_grantor || that_present_grantor) {
      if (!(this_present_grantor && that_present_grantor))
        return false;
      if (!this.grantor.equals(that.grantor))
        return false;
    }

    boolean this_present_grantorType = true && this.isSetGrantorType();
    boolean that_present_grantorType = true && that.isSetGrantorType();
    if (this_present_grantorType || that_present_grantorType) {
      if (!(this_present_grantorType && that_present_grantorType))
        return false;
      if (!this.grantorType.equals(that.grantorType))
        return false;
    }

    boolean this_present_grantOption = true && this.isSetGrantOption();
    boolean that_present_grantOption = true && that.isSetGrantOption();
    if (this_present_grantOption || that_present_grantOption) {
      if (!(this_present_grantOption && that_present_grantOption))
        return false;
      if (this.grantOption != that.grantOption)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_requestType = true && (isSetRequestType());
    list.add(present_requestType);
    if (present_requestType)
      list.add(requestType.getValue());

    boolean present_roleName = true && (isSetRoleName());
    list.add(present_roleName);
    if (present_roleName)
      list.add(roleName);

    boolean present_principalName = true && (isSetPrincipalName());
    list.add(present_principalName);
    if (present_principalName)
      list.add(principalName);

    boolean present_principalType = true && (isSetPrincipalType());
    list.add(present_principalType);
    if (present_principalType)
      list.add(principalType.getValue());

    boolean present_grantor = true && (isSetGrantor());
    list.add(present_grantor);
    if (present_grantor)
      list.add(grantor);

    boolean present_grantorType = true && (isSetGrantorType());
    list.add(present_grantorType);
    if (present_grantorType)
      list.add(grantorType.getValue());

    boolean present_grantOption = true && (isSetGrantOption());
    list.add(present_grantOption);
    if (present_grantOption)
      list.add(grantOption);

    return list.hashCode();
  }

  @Override
  public int compareTo(GrantRevokeRoleRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequestType()).compareTo(other.isSetRequestType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestType, other.requestType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoleName()).compareTo(other.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleName, other.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrincipalName()).compareTo(other.isSetPrincipalName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrincipalName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.principalName, other.principalName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrincipalType()).compareTo(other.isSetPrincipalType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrincipalType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.principalType, other.principalType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantor()).compareTo(other.isSetGrantor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantor, other.grantor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantorType()).compareTo(other.isSetGrantorType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantorType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantorType, other.grantorType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantOption()).compareTo(other.isSetGrantOption());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantOption()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantOption, other.grantOption);
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
    StringBuilder sb = new StringBuilder("GrantRevokeRoleRequest(");
    boolean first = true;

    sb.append("requestType:");
    if (this.requestType == null) {
      sb.append("null");
    } else {
      sb.append(this.requestType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("principalName:");
    if (this.principalName == null) {
      sb.append("null");
    } else {
      sb.append(this.principalName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("principalType:");
    if (this.principalType == null) {
      sb.append("null");
    } else {
      sb.append(this.principalType);
    }
    first = false;
    if (isSetGrantor()) {
      if (!first) sb.append(", ");
      sb.append("grantor:");
      if (this.grantor == null) {
        sb.append("null");
      } else {
        sb.append(this.grantor);
      }
      first = false;
    }
    if (isSetGrantorType()) {
      if (!first) sb.append(", ");
      sb.append("grantorType:");
      if (this.grantorType == null) {
        sb.append("null");
      } else {
        sb.append(this.grantorType);
      }
      first = false;
    }
    if (isSetGrantOption()) {
      if (!first) sb.append(", ");
      sb.append("grantOption:");
      sb.append(this.grantOption);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class GrantRevokeRoleRequestStandardSchemeFactory implements SchemeFactory {
    public GrantRevokeRoleRequestStandardScheme getScheme() {
      return new GrantRevokeRoleRequestStandardScheme();
    }
  }

  private static class GrantRevokeRoleRequestStandardScheme extends StandardScheme<GrantRevokeRoleRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GrantRevokeRoleRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.requestType = org.apache.hadoop.hive.metastore.api.GrantRevokeType.findByValue(iprot.readI32());
              struct.setRequestTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRINCIPAL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.principalName = iprot.readString();
              struct.setPrincipalNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRINCIPAL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.principalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
              struct.setPrincipalTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GRANTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.grantor = iprot.readString();
              struct.setGrantorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GRANTOR_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.grantorType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
              struct.setGrantorTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // GRANT_OPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.grantOption = iprot.readBool();
              struct.setGrantOptionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GrantRevokeRoleRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.requestType != null) {
        oprot.writeFieldBegin(REQUEST_TYPE_FIELD_DESC);
        oprot.writeI32(struct.requestType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      if (struct.principalName != null) {
        oprot.writeFieldBegin(PRINCIPAL_NAME_FIELD_DESC);
        oprot.writeString(struct.principalName);
        oprot.writeFieldEnd();
      }
      if (struct.principalType != null) {
        oprot.writeFieldBegin(PRINCIPAL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.principalType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.grantor != null) {
        if (struct.isSetGrantor()) {
          oprot.writeFieldBegin(GRANTOR_FIELD_DESC);
          oprot.writeString(struct.grantor);
          oprot.writeFieldEnd();
        }
      }
      if (struct.grantorType != null) {
        if (struct.isSetGrantorType()) {
          oprot.writeFieldBegin(GRANTOR_TYPE_FIELD_DESC);
          oprot.writeI32(struct.grantorType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetGrantOption()) {
        oprot.writeFieldBegin(GRANT_OPTION_FIELD_DESC);
        oprot.writeBool(struct.grantOption);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GrantRevokeRoleRequestTupleSchemeFactory implements SchemeFactory {
    public GrantRevokeRoleRequestTupleScheme getScheme() {
      return new GrantRevokeRoleRequestTupleScheme();
    }
  }

  private static class GrantRevokeRoleRequestTupleScheme extends TupleScheme<GrantRevokeRoleRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GrantRevokeRoleRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRequestType()) {
        optionals.set(0);
      }
      if (struct.isSetRoleName()) {
        optionals.set(1);
      }
      if (struct.isSetPrincipalName()) {
        optionals.set(2);
      }
      if (struct.isSetPrincipalType()) {
        optionals.set(3);
      }
      if (struct.isSetGrantor()) {
        optionals.set(4);
      }
      if (struct.isSetGrantorType()) {
        optionals.set(5);
      }
      if (struct.isSetGrantOption()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetRequestType()) {
        oprot.writeI32(struct.requestType.getValue());
      }
      if (struct.isSetRoleName()) {
        oprot.writeString(struct.roleName);
      }
      if (struct.isSetPrincipalName()) {
        oprot.writeString(struct.principalName);
      }
      if (struct.isSetPrincipalType()) {
        oprot.writeI32(struct.principalType.getValue());
      }
      if (struct.isSetGrantor()) {
        oprot.writeString(struct.grantor);
      }
      if (struct.isSetGrantorType()) {
        oprot.writeI32(struct.grantorType.getValue());
      }
      if (struct.isSetGrantOption()) {
        oprot.writeBool(struct.grantOption);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GrantRevokeRoleRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.requestType = org.apache.hadoop.hive.metastore.api.GrantRevokeType.findByValue(iprot.readI32());
        struct.setRequestTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.roleName = iprot.readString();
        struct.setRoleNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.principalName = iprot.readString();
        struct.setPrincipalNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.principalType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
        struct.setPrincipalTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.grantor = iprot.readString();
        struct.setGrantorIsSet(true);
      }
      if (incoming.get(5)) {
        struct.grantorType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
        struct.setGrantorTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.grantOption = iprot.readBool();
        struct.setGrantOptionIsSet(true);
      }
    }
  }

}

