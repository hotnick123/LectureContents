<template>
  <div>
    <router-link :to="{ name: 'StudentScorePage' }" 
        class="nav-link" 
        active-class="active">Student
    </router-link>
    <router-link :to="{ name: 'TriangleVuePage' }" 
        class="nav-link" 
        active-class="active">TriangleVue
    </router-link>
  </div>   
</template>