// src/components/UserPage.js
import React from 'react';

export function UserPage({ onLogout }) {
  return (
    <div>
      <h2>Book Your Ticket</h2>
      <form>
        <label>
          Select Flight:
          <select>
            <option>Flight A1 - 08:55 AM</option>
            <option>Flight B2 - 12:30 AM</option>
            <option>Flight C3 - 09:45 PM</option>
            <option>Flight D4 - 03:15 PM</option>
            <option>Flight E5 - 06:00 PM</option>
            <option>Flight F6 - 11:20 AM</option>
            <option>Flight G7 - 02:10 PM</option>
          </select>
        </label>
        <button type="submit">Book Now</button>
      </form>
      <button onClick={onLogout} style={{ marginTop: '1rem' }}>
        Logout
      </button>
    </div>
  );
}
