package com.lastcivilization.itemreadservice.domain;

class Item {

    private Long id;
    private String name;
    private Details details;
    private Type type;

    Item(Long id, String name, Details details, Type type) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.type = type;
    }

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Details getDetails() {
        return details;
    }

    void setDetails(Details details) {
        this.details = details;
    }

    Type getType() {
        return type;
    }

    void setType(Type type) {
        this.type = type;
    }

    static final class Builder {

        private Long id;
        private String name;
        private Details details = Details.Builder.aDetails().build();
        private Type type;

        private Builder() {
        }

        static Builder anItem() {
            return new Builder();
        }

        Builder id(Long id) {
            this.id = id;
            return this;
        }

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder details(Details details) {
            this.details = details;
            return this;
        }

        Builder type(Type type) {
            this.type = type;
            return this;
        }

        Item build() {
            return new Item(id, name, details, type);
        }
    }
}
