document.addEventListener('DOMContentLoaded', () => {
    // /api/bildirim endpoint'i şu anda tüm A durumundaki bildirimleri dönecek
    fetch('/api/bildirim')
        .then(res => {
            if (!res.ok) throw new Error('Ağ hatası: ' + res.status);
            return res.json();
        })
        .then(bildirimler => {
            const list = document.getElementById('notifications');
            bildirimler.forEach(b => {
                const li = document.createElement('li');
                li.textContent = `${b.baslik}: ${b.icerik}`;
                list.appendChild(li);
            });
        })
        .catch(err => console.error(err));
});
