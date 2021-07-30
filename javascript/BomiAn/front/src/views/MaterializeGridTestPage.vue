<template>
   <div class="container">
    <div class="row flex">
        <div class="col s12 m6 xl2 red">
            column 2
        </div>

        <div class="col s12 m6 l4 xl4 blue">
            column 4
        </div>

        <div class="col s12 m6 l6 xl6 green" >
            column 6
        </div>
        <div class="col s12 m12 l12 xl12 teal" >
            column 12
        </div>
     </div>
     <div class="row">
       <a class="btn waves-effect waves-red blue" @click="showMessage">
         Wi-Fi ON!
       </a>
       <a class="btn-floating-effect waves-teal" @click="showMessage">
         <i class="material-icons left">cloud</i>
         Cloud
       </a>
       <a class="btn-floating waves-effect waves-yellow" @click="showMessage">
         <i class="material-icons right">wifi</i>
         Wi-Fi 
       </a>
     </div>
  </div>
</template> 

<script>
export default {
  name: 'MaterializeGridTestPage'
}
</script>

<style scoped>
 .flex {
    display: flex;
    flex-wrap: wrap;
}

@media (min-width: 100px) {
    .my-custom-container{
        width:99%;
}}

</style>