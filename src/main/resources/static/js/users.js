// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#users').DataTable();
});

async function loadUsers {
  const request = await fetch('user/123', {
  method: 'GET',
  headers: {
  'Accept': 'application/json',
  'Content-Type': 'application/json'
  }

  });

  const users = await request.json();

  console.log(users);

}
