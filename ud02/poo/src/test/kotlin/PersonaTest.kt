import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PersonaTest {

    @Test
    fun testPersona() {
        val persona = Persona()
        val julio = Persona()

        persona.nombre = "María"
        persona.edad = 25

        julio.nombre = "Julio"
        julio.edad = 90

        assertEquals("María", persona.nombre)
        assertEquals(25, persona.edad)

        assertEquals("Julio", julio.nombre)
        assertEquals(90, julio.edad)
    }

    @Test
    fun testValoresIniciales() {
        val persona = Persona()

        assertNull(persona.nombre)
        assertEquals(-1, persona.edad)
    }
}