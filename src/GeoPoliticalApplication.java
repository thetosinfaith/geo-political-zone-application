public class GeoPoliticalApplication {
    public String getGeoPoliticalZone(String state) {
        switch (state.toLowerCase()){
            case "benue":
            case "fct":
            case "kogi":
            case "kwara":
            case "nasarrawa":
            case "niger":
            case "plateau":
                return "North Central";

            case "adamawa":
            case "bauchi":
            case "borno":
            case "gombe":
            case "taraba":
            case "yobe":
                return "North East";

            case "kaduna":
            case "katsina":
            case "kano":
            case "kebbi":
            case "sokoto":
            case "jigawa":
            case "zamfara":
                return "North West";

            case "abia":
            case "anambra":
            case "ebonyi":
            case "enugu":
            case "imo":
                return "South East";

            case "akwa ibom":
            case "bayelsa":
            case "cross river":
            case "delta":
            case "edo":
            case "rivers":
                return "South South";

            case "ekiti":
            case "lagos":
            case "osun":
            case "ondo":
            case "ogun":
            case "oyo":
                return "South West";

            default:
                return "Invalid state";
        }
    }
}