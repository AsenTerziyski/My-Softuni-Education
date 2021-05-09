package demo03BirthdayCelebrations;

public class Robot implements Identifiable {
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.setId(id);
        this.setModel(model);
    }

    private void setId(String id) {
        Validator.validateId(id);
        this.id = id;
    }

    private void setModel(String model) {
        Validator.validateModel(model);
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }
}
