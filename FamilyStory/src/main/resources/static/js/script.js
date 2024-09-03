document.addEventListener("DOMContentLoaded", function() {
    fetch('/api/albums')
        .then(response => response.json())
        .then(data => {
            const albumsDiv = document.getElementById('albums');
            data.forEach(album => {
                const albumDiv = document.createElement('div');
                albumDiv.innerHTML = `<h3>${album.name}</h3><p>${album.description}</p>`;
                albumsDiv.appendChild(albumDiv);
            });
        });
});
