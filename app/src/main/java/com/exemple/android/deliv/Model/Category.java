package com.exemple.android.deliv.Model;

public class Category {
    private String Name;
    private String Image;

    public Category(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public static class Food {

        public Food() {
        }

        private String Name, Price, Description, Image, Discount, MenuId;

        public Food(String name, String price, String description, String image, String discount, String menuId) {
            Name = name;
            Price = price;
            Description = description;
            Image = image;
            Discount = discount;
            MenuId = menuId;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String price) {
            Price = price;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getImage() {
            return Image;
        }

        public void setImage(String image) {
            Image = image;
        }

        public String getDiscount() {
            return Discount;
        }

        public void setDiscount(String discount) {
            Discount = discount;
        }

        public String getMenuId() {
            return MenuId;
        }

        public void setMenuId(String menuId) {
            MenuId = menuId;
        }
    }
}