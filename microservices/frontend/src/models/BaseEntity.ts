/**
 * This is base entity for all the model classes. Every model class should extend this.
 */
export class BaseEntity {
    name : string;

    public getName() : string {
        return this.name;
    }
}