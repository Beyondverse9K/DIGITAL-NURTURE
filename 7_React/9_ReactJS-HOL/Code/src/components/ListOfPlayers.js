import React from 'react';

export const ListOfPlayers = () => {
  const players = [
    { name: 'Rohit Sharma',   score: 42 },
    { name: 'Shubman Gill',    score: 92 },
    { name: 'Virat Kohli',       score: 69 },
    { name: 'Shreyas Iyer',   score: 23 },
    { name: 'KL Rahul',     score: 75 },
    { name: 'Hardik Pandya',   score: 58 },
    { name: 'Ravindra Jadeja',  score: 34 },
    { name: 'Ravichandran Ashwin', score: 12 },
    { name: 'Jasprit Bumrah', score: 10 },
    { name: 'Kuldeep Yadav',   score: 81 },
    { name: 'Ravi Bishnoi', score: 501 }
  ];
  // Filter players with score < 70
  const lowScorers = players.filter(p => p.score < 70);
  return (
    <div>
      <h2>All Players (11)</h2>
      <ul>
        {players.map(player => (
          <li key={player.name}>
            {player.name} – {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with Score &lt; 70</h3>
      <ul>
        {lowScorers.map(({ name, score }) => (
          <li key={name}>
            {name} – {score}
          </li>
        ))}
      </ul>
    </div>
  );
};
