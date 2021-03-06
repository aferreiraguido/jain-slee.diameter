/*
 *
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2018, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package org.mobicents.slee.resource.diameter.slh.events.avp;

import net.java.slee.resource.diameter.slh.events.avp.AdditionalServingNodeAvp;
import net.java.slee.resource.diameter.slh.events.avp.LCSRoutingInfoAVPCodes;
import org.mobicents.slee.resource.diameter.base.events.avp.GroupedAvpImpl;
import net.java.slee.resource.diameter.base.events.avp.Address;
import net.java.slee.resource.diameter.base.events.avp.DiameterIdentity;

/**
 * Implementation for {@link net.java.slee.resource.diameter.slh.events.avp.AdditionalServingNodeAvp}
 *
 * @author <a href="mailto:fernando.mendioroz@gmail.com"> Fernando Mendioroz </a>
 */
public class AdditionalServingNodeAvpImpl extends GroupedAvpImpl implements AdditionalServingNodeAvp {

  public AdditionalServingNodeAvpImpl() {
    super();
  }

  /**
   * @param code
   * @param vendorId
   * @param mnd
   * @param prt
   * @param value
   */
  public AdditionalServingNodeAvpImpl(int code, long vendorId, int mnd, int prt, byte[] value) {
    super(code, vendorId, mnd, prt, value);
  }

  public boolean hasSGSNNumber() {
    return hasAvp(LCSRoutingInfoAVPCodes.SGSN_NUMBER, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public byte[] getSGSNNumber() {
    return getAvpAsOctetString(LCSRoutingInfoAVPCodes.SGSN_NUMBER, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setSGSNNumber(byte[] additionalSgsnNumber) {
    addAvp(LCSRoutingInfoAVPCodes.SGSN_NUMBER, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalSgsnNumber);
  }

  public boolean hasSGSNName() {
    return hasAvp(LCSRoutingInfoAVPCodes.SGSN_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public DiameterIdentity getSGSNName() {
    return getAvpAsDiameterIdentity(LCSRoutingInfoAVPCodes.SGSN_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setSGSNName(DiameterIdentity additionalSgsnName) {
    addAvp(LCSRoutingInfoAVPCodes.SGSN_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalSgsnName);
  }

  public boolean hasSGSNRealm() {
    return hasAvp(LCSRoutingInfoAVPCodes.SGSN_REALM, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public DiameterIdentity getSGSNRealm() {
    return getAvpAsDiameterIdentity(LCSRoutingInfoAVPCodes.SGSN_REALM, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setSGSNRealm(DiameterIdentity additionalSgsnRealm) {
    addAvp(LCSRoutingInfoAVPCodes.SGSN_REALM, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalSgsnRealm);
  }

  public boolean hasMMEName() {
    return hasAvp(LCSRoutingInfoAVPCodes.MME_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public DiameterIdentity getMMEName() {
    return getAvpAsDiameterIdentity(LCSRoutingInfoAVPCodes.MME_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setMMEName(DiameterIdentity additionalMmeName) {
    addAvp(LCSRoutingInfoAVPCodes.MME_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalMmeName);
  }

  public boolean hasMMERealm() {
    return hasAvp(LCSRoutingInfoAVPCodes.MME_REALM, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public DiameterIdentity getMMERealm() {
    return getAvpAsDiameterIdentity(LCSRoutingInfoAVPCodes.MME_REALM, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setMMERealm(DiameterIdentity additionalMmeRealm) {
    addAvp(LCSRoutingInfoAVPCodes.MME_REALM, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalMmeRealm);
  }

  public boolean hasMSCNumber() {
    return hasAvp(LCSRoutingInfoAVPCodes.MSC_NUMBER, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public byte[] getMSCNumber() {
    return getAvpAsOctetString(LCSRoutingInfoAVPCodes.MSC_NUMBER, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setMSCNumber(byte[] additionalMscNumber) {
    addAvp(LCSRoutingInfoAVPCodes.MSC_NUMBER, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalMscNumber);
  }

  public boolean hasLcsCapabilitiesSets() {
    return hasAvp(LCSRoutingInfoAVPCodes.LCS_CAPABILITIES_SETS, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public long getLcsCapabilitiesSets() {
    return getAvpAsUnsigned32(LCSRoutingInfoAVPCodes.LCS_CAPABILITIES_SETS, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setLcsCapabilitiesSets(long additionalLcsCapabilitiesSets) {
    addAvp(LCSRoutingInfoAVPCodes.LCS_CAPABILITIES_SETS, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalLcsCapabilitiesSets);
  }

  public boolean has3GPPAAAServerName() {
    return hasAvp(LCSRoutingInfoAVPCodes.TGPP_AAA_SERVER_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public DiameterIdentity get3GPPAAAServerName() {
    return getAvpAsDiameterIdentity(LCSRoutingInfoAVPCodes.TGPP_AAA_SERVER_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void set3GPPAAAServerName(DiameterIdentity additional3gppAAAServerName) {
    addAvp(LCSRoutingInfoAVPCodes.TGPP_AAA_SERVER_NAME, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additional3gppAAAServerName);
  }

  public boolean hasGMLCAddress() {
    return hasAvp(LCSRoutingInfoAVPCodes.GMLC_ADDRESS, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public Address getGMLCAddress() {
    return getAvpAsAddress(LCSRoutingInfoAVPCodes.GMLC_ADDRESS, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  public void setGMLCAddress(Address additionalGmlcAddress) {
    addAvp(LCSRoutingInfoAVPCodes.GMLC_ADDRESS, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, additionalGmlcAddress);
  }

}
