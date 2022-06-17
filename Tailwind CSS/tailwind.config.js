/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ['./*.html'],
  theme: {
    screens: {
      sm: '480px',
      md: '760px',
      lg: '980px',
      xl: '1440px'
    },
    extend: {
      colors: {
        brightRed: "hsl(12, 80%, 59%)",
        brightRedLight: "hsl(12, 88%, 69%)",
        brightRedSupLight: 'hsl(12, 88%, 95%)',
        veryPaleRed: "hsl(13, 100%, 95%)",
        darkBlue: "hsl(228, 39%, 23%)",
        veryDarkBlue: "hsl(223, 12%, 13%)",
        darkGrayishBlue: "hsl(227, 12%, 61%)",
        veryLightGray: "hsl(0, 0%, 98%)"
      },
    },
  },
  plugins: [],
}
