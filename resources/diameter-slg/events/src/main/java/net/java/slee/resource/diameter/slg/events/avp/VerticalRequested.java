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

import java.io.Serializable;

import net.java.slee.resource.diameter.base.events.avp.Enumerated;

/**
 * Java class representing the Vertical-Requested enumerated type.
 * From the Diameter-based ELP SLg Reference Point Protocol Details (3GPP TS 29.172 V14.1.0) specification
 * as element of LCS-QoS grouped AVP
 * <p>
 * <pre>
 * 7.4.9	Vertical-Requested
 * 	The Vertical-Requested AVP is of type Enumerated. The following values are defined:
 * 		VERTICAL_COORDINATE_IS_NOT_REQUESTED (0)
 * 		VERTICAL_COORDINATE_IS_REQUESTED (1)
 * 	Default value if AVP is not present is: VERTICAL_COORDINATE_IS_NOT_REQUESTED (0).
 * </pre>
 *
 * @author <a href="mailto:fernando.mendioroz@gmail.com"> Fernando Mendioroz </a>
 */
public class VerticalRequested implements Enumerated, Serializable {

  private static final long serialVersionUID = 1L;

  public static final int _VERTICAL_COORDINATE_IS_NOT_REQUESTED = 0;
  public static final int _VERTICAL_COORDINATE_IS_REQUESTED = 1;

  public static final VerticalRequested VERTICAL_COORDINATE_IS_NOT_REQUESTED = new VerticalRequested(_VERTICAL_COORDINATE_IS_NOT_REQUESTED);
  public static final VerticalRequested VERTICAL_COORDINATE_IS_REQUESTED = new VerticalRequested(_VERTICAL_COORDINATE_IS_REQUESTED);

  private int value = -1;

  private VerticalRequested(int value) {
    this.value = value;
  }

  public static VerticalRequested fromInt(int type) {
    switch (type) {
      case _VERTICAL_COORDINATE_IS_NOT_REQUESTED:
        return VERTICAL_COORDINATE_IS_NOT_REQUESTED;
      case _VERTICAL_COORDINATE_IS_REQUESTED:
        return VERTICAL_COORDINATE_IS_REQUESTED;
      default:
        throw new IllegalArgumentException("Invalid value: " + type);
    }
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    switch (value) {
      case _VERTICAL_COORDINATE_IS_NOT_REQUESTED:
        return "VERTICAL_COORDINATE_IS_NOT_REQUESTED";
      case _VERTICAL_COORDINATE_IS_REQUESTED:
        return "VERTICAL_COORDINATE_IS_REQUESTED";
      default:
        return "<Invalid Value>";
    }
  }

}
