$(document).ready(async () => {
const users = await fetchUsers();
renderUsers(users)
initDataTable();
})

async function fetchUsers() {
  try {
    const res = await fetch('api/users', {
      headers: { 'Accept': 'application/json' }
    });
    if (!res.ok) throw new Error(`HTTP ${res.status}`);
    return await res.json();
  } catch (err) {
    console.error('Error cargando usuarios:', err);
    return [];
  }
}

function renderUsers(users) {
  const rows = users
    .map(u => createRowHtml(u))
    .join('');
  document.querySelector('#users tbody').innerHTML = rows;
}

function initDataTable() {
  $('#users').DataTable();
}

function createRowHtml({ id, firstName, lastName, email, cellphone }) {
let cellUser = cellphone == null ? '-' : cellphone;
  return `
    <tr data-id="${id}">
      <td>${id}</td>
      <td>${firstName} ${lastName}</td>
      <td>${email}</td>
      <td>${cellUser}</td>
      <td>
        <button class="btn btn-danger btn-circle btn-sm delete-btn">
          <i  class="fas fa-trash" onclick=deleteUser(${id})></i>
        </button>
      </td>
    </tr>`;
}

async function deleteUser(id) {
  if (!confirm('Are you sure you want to delete this user?')) {
    return;
  }
  try {
    const res = await fetch(`api/users/${id}`, {
      method: "DELETE",
      headers: { 'Accept': 'application/json',
      'Authorization': localStorage.token,
      }
    });
    if (!res.ok) {
      throw new Error(`HTTP ${res.status}`);
    }
    location.reload();
  } catch (err) {
    console.error('Error al eliminar el usuario:', err);
    alert('No se pudo eliminar el usuario');
  }
}

