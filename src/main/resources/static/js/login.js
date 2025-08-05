$(document).ready(async () => {
  const result = await loginUser();
  console.log('Login result:', result);
});

async function loginUser() {
  const { email, password } = getFormData();

  if (!validatePasswords(password, repeatPassword)) {
    alert('Passwords do not match');
    return;
  }

  try {
    const res = await fetch('api/login', {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ email, password })
    });

    const response = await request.json();
  } catch (err) {
    console.error('Error registering user:', err);
  }
}

function getFormData() {
  return {
    email:          document.getElementById('txtEmail').value.trim(),
    password:       document.getElementById('txtPassword').value,
  };
}
