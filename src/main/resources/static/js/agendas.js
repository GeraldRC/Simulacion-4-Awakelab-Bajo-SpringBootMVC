var app = new Vue({
    el: '#app',
    data: {
      message: 'Agendas',
      especialidades:[],
     doctores:[],
      seleccion:''
    },
    methods:{
        obtenerDoctores:function () {
            this.especialidades.forEach(especialidad => {
                if(especialidad.idEspecialidad == this.seleccion){
                    this.doctores = especialidad.doctores;
                }
            });
          }
    },
    mounted () {
       fetch('http://192.168.0.7:9898/especialidades')
        .then(response => response.json())
        .then(data => this.especialidades  = data)
        .catch((error) => {
            console.error('Error:', error);
        })
    }
})