import React from 'react';
export function GuestPage({ onLogin }) {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>Here are today’s flights:</p>
      <ul>
        <li>Flight A1 - 08:55 AM</li>
        <li>Flight B2 - 12:30 AM</li>
        <li>Flight C3 - 09:45 PM</li>
        <li>Flight D4 - 03:15 PM</li>
        <li>Flight E5 - 06:00 PM</li>
        <li>Flight F6 - 11:20 AM</li>
        <li>Flight G7 - 02:10 PM</li>
      </ul>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}
