package bank;

public class User implements IUser {
    private String name;
    private String cpf;

    public User(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getCPF() {
        return this.cpf;
    }
}
