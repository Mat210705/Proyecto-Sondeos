const app = Vue.createApp({
    data(){
        return{
           libros:[],
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
                    'Prestamo Otorgado con éxito!',
                    'Puedes chequear tu cuenta.',
                    'success',), setTimeout(() => {
                        location.reload();
                    }, 3000))
                            
                .catch(res => console.log(res.response.data))
        },
        
        
    
},
    
})
console = app.mount("#app")
