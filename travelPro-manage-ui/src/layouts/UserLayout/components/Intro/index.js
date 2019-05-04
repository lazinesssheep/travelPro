import React from 'react';

const LoginIntro = () => {
  return (
    <div style={styles.container}>
      <div style={styles.content}>
        <div style={styles.title}></div>
      </div>
    </div>
  );
};

const styles = {
  container: {
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    justifyContent: 'center',
    position: 'relative',
  },
  content: {
    width: '400px',
    color: '#fff',
  },
  title: {
    marginBottom: '20px',
    fontWeight: '700',
    fontSize: '48px',
    lineHeight: '1.5',
  },
};

export default LoginIntro;
