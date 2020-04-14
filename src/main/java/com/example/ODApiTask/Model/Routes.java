package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Routes
    {
        @JsonProperty("OriginAirportCode")
        private String OriginAirportCode;
        @JsonProperty("DestinationAirportCode")
        private String DestinationAirportCode;
        @JsonProperty("IsActive")
        private boolean IsActive;
        @JsonProperty("IsJetBlue")
        private boolean IsJetBlue;
        @JsonProperty("IsInterline")
        private boolean IsInterline;
        @JsonProperty("IsCodeShare")
        private boolean IsCodeShare;

        public void setOriginAirportCode(String OriginAirportCode){
            this.OriginAirportCode = OriginAirportCode;
        }
        public String getOriginAirportCode(){
            return this.OriginAirportCode;
        }
        public void setDestinationAirportCode(String DestinationAirportCode){
            this.DestinationAirportCode = DestinationAirportCode;
        }
        public String getDestinationAirportCode(){
            return this.DestinationAirportCode;
        }
        public void setIsActive(boolean IsActive){
            this.IsActive = IsActive;
        }
        public boolean getIsActive(){
            return this.IsActive;
        }
        public void setIsJetBlue(boolean IsJetBlue){
            this.IsJetBlue = IsJetBlue;
        }
        public boolean getIsJetBlue(){
            return this.IsJetBlue;
        }
        public void setIsInterline(boolean IsInterline){
            this.IsInterline = IsInterline;
        }
        public boolean getIsInterline(){
            return this.IsInterline;
        }
        public void setIsCodeShare(boolean IsCodeShare){
            this.IsCodeShare = IsCodeShare;
        }
        public boolean getIsCodeShare(){
            return this.IsCodeShare;
        }

        @Override
        public String toString() {
            return "Routes{" +
                    "OriginAirportCode='" + OriginAirportCode + '\'' +
                    ", DestinationAirportCode='" + DestinationAirportCode + '\'' +
                    ", IsActive=" + IsActive +
                    ", IsJetBlue=" + IsJetBlue +
                    ", IsInterline=" + IsInterline +
                    ", IsCodeShare=" + IsCodeShare +
                    '}';
        }
    }

