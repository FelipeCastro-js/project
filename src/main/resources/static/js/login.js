$(document).ready(async () => {
  try {
    const result = await loginUser();
    console.log('Login result:', result);
  } catch (err) {
    // ya está logueado en loginUser
  }
});

async function loginUser() {
  const { email, password } = getFormData();

  try {
    const res = await fetch('api/login', {
      method: 'POST',
      headers: {
        'Accept':       'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ email, password })
    });

    if (!res.ok) {
      throw new Error(`HTTP ${res.status}`);
    }

    const data = await res.json();
    if (data !== 'FAIL') {
      localStorage.token = data;
      localStorage.email = email;

       window.location.href = 'index.html';
    } else {
      alert('The credentials are incorrect. Please try again');
    }

    return data;
  } catch (err) {
    console.error('Error logging in user:', err);
    throw err;
  }
}

function getFormData() {
  return {
    email:    document.getElementById('txtEmail').value.trim(),
    password: document.getElementById('txtPassword').value
  };
}
