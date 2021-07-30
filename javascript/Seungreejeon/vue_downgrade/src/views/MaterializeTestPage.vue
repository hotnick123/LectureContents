<template>
  <div class="app">
      <div class="teal lighten-1 center-align">
          이것이 Materialize 닷!
      </div>
      <div class="white-text teal dartken-5">
           <v-icon>mdi-anchor</v-icon>
          우왕 굳!

      </div>
      <div class="row">
          <!-- class responsive-img가 단순 클래스명이아니라 반응형으로 이미지를 만들어준다. -->
          <img class="responsive-img" src="@/assets/img/nissan_maxima.png">
      </div>
      <div class="row">
          <i class="material-icons small teal-text">call</i>
          <i class="material-icons small teal-text">mail</i>
      </div>
      <div class="video-container">
          <iframe width="1280" heigth="720" src="https://www.youtube.com/embed/weeI1G46q0o" 
          frameborder="0"
          allow="accelerometer; autoplay; encrypted-media; gryroscope; picture-in-picture"
          allowfullscrenn></iframe>
      </div>
      <div>
        <img class="circle responsive-img hide-on-small-only" src="@/assets/img/Spyder.jpg">
      </div>
      
  </div>
</template>

<script>
export default {

}
</script>

<style>

</style>