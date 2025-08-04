$(document).ready(async () => {
  const result = await registerUsers();
  console.log('Register result:', result);
});

async function registerUsers() {
  const { firstName, lastName, email, password, repeatPassword } = getFormData();

  if (!validatePasswords(password, repeatPassword)) {
    alert('Passwords do not match');
    return;
  }

  try {
    const res = await fetch('api/users', {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ firstName, lastName, email, password })
    });
  } catch (err) {
    console.error('Error registering user:', err);
  }
}

function getFormData() {
  return {
    firstName:      document.getElementById('txtName').value.trim(),
    lastName:       document.getElementById('txtLastName').value.trim(),
    email:          document.getElementById('txtEmail').value.trim(),
    password:       document.getElementById('txtPassword').value,
    repeatPassword: document.getElementById('txtRepeatPassword').value
  };
}

function validatePasswords(pw, repeat) {
  return pw !== '' && pw === repeat;
}
