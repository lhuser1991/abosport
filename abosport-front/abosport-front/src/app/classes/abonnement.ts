import { Client } from "./client";
import { Sport } from "./sport";

export class Abonnement {
    idclient: number = 0;
    idsport: number = 0;
    client: Client = new Client();
    sport: Sport = new Sport();
}
