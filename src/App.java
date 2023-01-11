public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("Lucas");
        user.setEmail("brandslucas@gmail.com");
        user.setCpf("1111111111");
        user.setAge(28);
        user.setSchool("UFF");

        Materias materia = new Materias();
        materia.setName("CalculoIII");
        materia.setSchool("UFRJ");

        System.out.println("O usuário " + user.getName() + ", da(o) " + user.getSchool() + ", está acompanhando o seguinte material:\n" + materia.getName() + ", da(o) " + materia.getSchool());
    }
}
