<template>
  <div>
    <app-login></app-login>
  </div>
</template>

<script>
import appLogin from '@/components/Login'
export default {
  name: 'App',
  components: {
    appLogin

  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
