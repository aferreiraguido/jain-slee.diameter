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

package net.java.slee.resource.diameter.slg.events.avp;

import net.java.slee.resource.diameter.base.events.avp.GroupedAvp;

/**
 * Defines an interface representing the LCS-EPS-Client-Name AVP type.
 * From the Diameter-based ELP SLg interface for Control Plane LCS (3GPP TS 29.172 V14.1.0) specification.
 * <p>
 * <pre>
 * 7.4.3	LCS-EPS-Client-Name
 *  The LCS-EPS-Client-Name AVP is of type Grouped.
 *  AVP format:
 *            LCS-EPS-Client-Name ::= <AVP header: 2501 10415>
 *                                    [ LCS-Name-String ]
 *                                    [ LCS-Format-Indicator ]
 *
 *  The details of the LCS-Name-String AVP and the LCS-Format-Indicator AVP are described in 3GPP TS 32.299 [10].
 * </pre>
 *
 * @author <a href="mailto:fernando.mendioroz@gmail.com"> Fernando Mendioroz </a>
 */
public interface LCSEPSClientNameAvp extends GroupedAvp {

  /*
    From 3GPP TS 32.299 (v14.1.0)

		7.2.90	LCS-Name-String AVP
		The LCS-Name-String AVP (AVP code 1238) is of type UTF8String and contains the LCS Client name.

  */
  boolean hasLCSNameString();

  String getLCSNameString();

  void setLCSNameString(String lcsNameString);

  /*
    From 3GPP TS 32.299 (v14.1.0)
		7.2.88	LCS-Format-Indicator AVP

		The LCS-Format-Indicator AVP (AVP code 1237) is of type Enumerated and contains the format of the LCS Client name.
		It can be one of the following values:

		0	LOGICAL_NAME
		1	EMAIL_ADDRESS
		2	MSISDN
		3	URL
		4	SIP_URL
	*/
  boolean hasLCSFormatIndicator();

  LCSFormatIndicator getLCSFormatIndicator();

  void setLCSFormatIndicator(LCSFormatIndicator lcsFormatIndicator);

}
