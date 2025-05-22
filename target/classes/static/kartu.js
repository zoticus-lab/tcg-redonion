function showModal(button) {
  const nama = button.getAttribute('data-nama');
  const deskripsi = button.getAttribute('data-deskripsi');
  const kondisi = button.getAttribute('data-kondisi');
  const rarity = button.getAttribute('data-rarity');
  const stok = parseInt(button.getAttribute('data-stok'));
  const harga = Number(button.getAttribute('data-harga'));
  const gambar = button.getAttribute('data-gambar');

  document.getElementById('modalNama').innerText = nama;
  document.getElementById('modalDeskripsi').innerText = deskripsi;
  document.getElementById('modalKondisi').innerText = kondisi;
  document.getElementById('modalRarity').innerText = rarity;
  document.getElementById('modalStok').innerText = stok + ' Tersisa';
  document.getElementById('modalHarga').innerText = 'Rp ' + harga.toLocaleString();
  document.getElementById('modalImage').src = gambar;

  // Reset class
  const kondisiSpan = document.getElementById('modalKondisi');
  const raritySpan = document.getElementById('modalRarity');
  const stokSpan = document.getElementById('modalStok');
  kondisiSpan.className = 'badge';
  raritySpan.className = 'badge';
  stokSpan.className = 'stok-indikator';

  // Tambah class berdasarkan kondisi
  if (kondisi.toLowerCase() === 'mint') kondisiSpan.classList.add('kondisi-mint');
  else if (kondisi.toLowerCase() === 'good') kondisiSpan.classList.add('kondisi-good');
  else kondisiSpan.classList.add('kondisi-damaged');

  // Tambah class berdasarkan rarity
  if (rarity.toLowerCase() === 'common') raritySpan.classList.add('rarity-common');
  else if (rarity.toLowerCase() === 'rare') raritySpan.classList.add('rarity-rare');
  else if (rarity.toLowerCase() === 'ultra rare') raritySpan.classList.add('rarity-ultrarare');

  // Efek stok rendah
  if (stok === 1) {
    stokSpan.classList.add('low-stock');
  }

  document.getElementById('cardModal').style.display = 'flex';
}
