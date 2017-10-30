/*
 *
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2017, Telestax Inc and individual contributors
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

package net.java.slee.resource.diameter.slh.events.avp;


import net.java.slee.resource.diameter.base.events.avp.GroupedAvp;

/**
 * Defines an interface representing the Supported-Features grouped AVP type.
 *
 * From the Diameter Cx and Dx Reference Point Protocol Details (3GPP TS 29.229 V13.0.0) specification,
 * reused by SLh (3GPP TS 29.173):
 * <pre>
 * 6.3.29        Supported-Features AVP
 *
 * The Supported-Features AVP is of type Grouped. If this AVP is present it may inform the
 * destination host about the features that the origin host supports for the application.
 * The Feature-List AVP contains a list of supported features of the origin host.
 * The Vendor-ID AVP and the Feature-List AVP shall together identify which feature list is
 * carried in the Supported-Features AVP for the Application-ID present in the command header.
 *
 * Where a Supported-Features AVP is used to identify features that have been defined by
 * 3GPP, the Vendor-ID AVP shall contain the vendor ID of 3GPP. Vendors may define
 * proprietary features, but it is strongly recommended that the possibility is used only as
 * the last resort. Where the Supported-Features AVP is used to identify features that have
 * been defined by a vendor other than 3GPP, it shall contain the vendor ID of the specific
 * vendor in question.
 *
 * If there are multiple feature lists defined by the same vendor and the same application,
 * the Feature-List-ID AVP shall differentiate those lists from one another.
 * The destination host shall use the value of the Feature-List-ID AVP to identify the feature list.
 *
 * AVP format
 * Supported-Features ::=  < AVP Header: 628 10415 >
 *                         { Vendor-Id }
 *                         { Feature-List-ID }
 *                         { Feature-List }
 *                         *[AVP]
 * </pre>
 *
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public interface SupportedFeaturesAvp extends GroupedAvp {

  /**
   * Returns true if the Vendor-Id AVP is present in the message.
   */
  public boolean hasVendorId();

  /**
   * Returns the value of the Vendor-Id AVP, of type Unsigned32.
   * A return value of null implies that the AVP has not been set.
   */
  public long getVendorId();

  /**
   * Sets the value of the Vendor-Id AVP, of type Unsigned32.
   * @throws IllegalStateException if setVendorId has already been called
   */
  public void setVendorId(long vendorId);

  /**
   * Returns true if the Feature-List-ID AVP is present in the message.
   */
  public boolean hasFeatureListId();

  /**
   * Returns the value of the Feature-List-ID AVP, of type Unsigned32.
   * A return value of null implies that the AVP has not been set.
   */
  public long getFeatureListId();

  /**
   * Sets the value of the Feature-List-ID AVP, of type Unsigned32.
   * @throws IllegalStateException if setFeatureListId has already been called
   */
  public void setFeatureListId(long featureListId);

  /**
   * Returns true if the Feature-List AVP is present in the message.
   */
  public boolean hasFeatureList();

  /**
   * Returns the value of the Feature-List AVP, of type Unsigned32.
   * A return value of null implies that the AVP has not been set.
   */
  public long getFeatureList();

  /**
   * Sets the value of the Feature-List AVP, of type Unsigned32.
   * @throws IllegalStateException if setFeatureList has already been called
   */
  public void setFeatureList(long featureList);

}
