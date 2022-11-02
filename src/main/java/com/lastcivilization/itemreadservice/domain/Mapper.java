package com.lastcivilization.itemreadservice.domain;

import com.lastcivilization.itemreadservice.domain.view.DetailsModel;
import com.lastcivilization.itemreadservice.domain.view.ItemModel;

final class Mapper {

    private Mapper(){
        throw new RuntimeException("You can not create instance of this class!");
    }

    static ItemModel toModel(Item item){
        Type type = item.getType();
        return new ItemModel(
                item.getId(),
                item.getName(),
                toModel(item.getDetails()),
                type.toString()
        );
    }

    private static DetailsModel toModel(Details details) {
        return new DetailsModel(
                details.getId(),
                details.getResistance(),
                details.getDamage(),
                details.getStrength(),
                details.getDexterity(),
                details.getDefense(),
                details.getHealth(),
                details.getTime(),
                details.getLvl()
        );
    }

    static Item toDomain(ItemModel itemModel){
        return Item.Builder.anItem()
                .id(itemModel.id())
                .name(itemModel.name())
                .details(toDomain(itemModel.details()))
                .type(Type.valueOf(itemModel.type()))
                .build();
    }

    private static Details toDomain(DetailsModel detailsModel) {
        return Details.Builder.aDetails()
                .id(detailsModel.id())
                .resistance(detailsModel.resistance())
                .damage(detailsModel.damage())
                .strength(detailsModel.strength())
                .dexterity(detailsModel.dexterity())
                .defense(detailsModel.defense())
                .health(detailsModel.health())
                .time(detailsModel.time())
                .lvl(detailsModel.lvl())
                .build();
    }
}
