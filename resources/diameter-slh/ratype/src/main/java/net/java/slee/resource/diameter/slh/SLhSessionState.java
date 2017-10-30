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

package net.java.slee.resource.diameter.slh;

import java.io.StreamCorruptedException;

/**
 * Enum representing SLh FSM States.
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
public enum SLhSessionState {

  IDLE(0), PENDING_EVENT(1), PENDING_INITIAL(2), PENDING_UPDATE(3), PENDING_TERMINATION(4), PENDING_BUFFERED(5), OPEN(6), TERMINATED(7);

  private int value = -1;

  /**
   * Constructor.
   * @param val the value to be initialized with.
   */
  private SLhSessionState(int val) {
    this.value = val;
  }

  /**
   * Getter for the current FSM state as int.
   * @return an int corresponding to the actual FSM state.
   */
  public int getValue() {
    return this.value;
  }

  /**
   * Getter for the current FSM state as enum.
   * @return enum object corresponding to the actual FSM state.
   * @throws StreamCorruptedException
   */
  private Object readResolve() throws StreamCorruptedException {
    try {
      return fromInt(value);
    }
    catch (IllegalArgumentException iae) {
      throw new StreamCorruptedException("Invalid internal state found: " + value);
    }
  }

  /**
   * Converts a given state value into it's equivalent.
   * @param value int to be converted
   * @return the corresponding SLhSessionState enum value
   * @throws IllegalArgumentException if value is not applicable for this enum
   */
  public SLhSessionState fromInt(int value) throws IllegalArgumentException {
    switch (value)
    {
      case 0:
        return IDLE;
      case 1:
        return PENDING_EVENT;
      case 2:
        return PENDING_INITIAL;
      case 3:
        return PENDING_UPDATE;
      case 4:
        return PENDING_TERMINATION;
      case 5:
        return PENDING_BUFFERED;
      case 6:
        return OPEN;
      case 7:
        return TERMINATED;

      default:
        throw new IllegalArgumentException("Unknown value for LCS Routing-Info Session State: " + value);
    }
  }

}
