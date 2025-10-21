import Card from '../Home/Card';

const navigationItems = [
  { name: "Inicio", href: "#inicio" },
  { name: "Servicios", href: "#servicios" },
  { name: "Productos", href: "#productos" },
  { name: "Sobre Nosotros", href: "#sobreN" },
  { name: "Contacto", href: "#contacto" }
]

const Home = ()=>{
  return (
    <div>
      <p>uso de <code>tailwindcss</code></p>
      <h1 className="text-3xl font-bold underline bg-blue-500 radial-gradient(ellipse at center, #1e3a8a, #3b82f6, #60a5fa) border-4 border-blue-700 p-4 text-white radius-2xl">
        Hello world!
      </h1>
      <h2>temas</h2>
      <h3>Manejo de Hook</h3>
      <h3>Externals API's</h3>
      <nav>
        <div>
          <div>
            {/* Logo */}
            <div className="flex-shrink-0">
              <h1 className="text-primary font-medium">Mi Empresa</h1>
            </div>
            {/*Desktop Navigation */}
            <div className="hidden md:block">
              <div className="ml-10 flex items-baseline space-x-8">
                {
                  navigationItems.map((items)=>
                    <a
                      key={items.name}
                      href={items.href}>
                      {items.name}
                    </a>
                  )
                }
              </div>
            </div>
          </div>
        </div>
      </nav>

      <Card title={"Card 1"} description={"descripcion 1"} />
    </div>
  )
}

export default Home;