const app = Vue.createApp({
    data(){
        return{
           libros:[],
           id:"",
           titulo:"",
           autor:"",
           precio:"",
           fechaDeLanzamiento:"", 
        }
    },
    created(){
        this.loadData();
    },
    methods:{
        loadData(){
            axios.get("/api/libros")
            .then(response =>{
                this.libros = response.data;
            })
        },
        crearLibro(){
            axios.post('/api/current/libros',
                {
                    "titulo": this.titulo,
                    "autor": this.autor,
                    "precio": this.precio,
                    "fechaDeLanzamiento": this.fechaDeLanzamiento,
                },{headers:{'content-type':'application/json'}})
                .then(res => swal(
                    'Libro creado con exito!',
                    'Puedes chequear tus libros.',
                    'success',), setTimeout(() => {
                        location.reload();
                    }, 3000))
                    .catch(res => swal("Intente nuevamente", "error",), setTimeout(() => {
                        location.reload();
                    }, 3000))  
        },
        editarLibro(){
           axios.put('/api/libros/update',
                {
                    "id": this.id,
                    "titulo": this.titulo,
                    "autor": this.autor,
                    "precio": this.precio,
                    "fechaDeLanzamiento": this.fechaDeLanzamiento,
                },{headers:{'content-type':'application/json'}})
                .then(res => swal(
                    'Libro editado con exito!',
                    'Puedes chequear tus libros.',
                    'success',), setTimeout(() => {
                        location.reload();
                    }, 3000))
                    .catch(res => swal("Intente nuevamente", "error",), setTimeout(() => {
                        location.reload();
                    }, 3000))  
        },
        eliminarLibro(){
            axios.delete(`/api/libros/delete?titulo=${this.titulo}`,{ headers: { 'content-type': 'application/x-www-form-urlencoded' } })
            .then(res => swal(
                'Libro Eliminado con exito',
                 'Puedes chequear tus Libros.',
                 'success',), setTimeout(() => {
                  location.reload();
                }, 3000))                           
            .catch(res => swal("Intente nuevamente", "error",), setTimeout(() => {
                location.reload();
            }, 3000))    
        }
        
    
},
    
})
console = app.mount("#app")
