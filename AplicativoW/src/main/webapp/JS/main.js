const fila = document.querySelector('.contenedor-carousel');

const flechaIzquierda = document.getElementById('flecha-izquierda');
const flechaDerecha = document.getElementById('flecha-derecha');

flechaDerecha.addEventListener('click', ()=>{
	fila.scrollLeft += fila.offsetWidth;
});

flechaIzquierda.addEventListener('click', ()=>{
	fila.scrollLeft -= fila.offsetWidth;
});