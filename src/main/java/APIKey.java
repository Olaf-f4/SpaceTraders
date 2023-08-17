import com.google.gson.Gson;

public class APIKey {

    public void Key() {

        Header header = new Header();
        header.setAuthorization("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZGVudGlmaWVyIjoiT0xBRiIsInZlcnNpb24iOiJ2MiIsInJlc2V0X2RhdGUiOiIyMDIzLTA4LTA1IiwiaWF0IjoxNjkyMTEyMjI2LCJzdWIiOiJhZ2VudC10b2tlbiJ9.ZlSaD-vd7BaNXwnSUSrlOt6HapADG1JbQ1CfPPDFyeGuPfJSVK5Zn6p_7xC7FuJdJ78q6EuJZIFyLMg9TmiltvxH7SGMwJaVyJYLm_YM22awDFnj4Lxob16hrrXZRWu3UXBOohq5Hl__p4KzytF-XGOcz2Wr_Cuwrn-A8PyDjkvJQ6-VYZLDGnWzNkgXQUy1dcKR5OaMqzb-djQw-IbmrQofkkuoWvQ6w8lqCmsK_q7sMCNbeSIUm0-FvlD35v4cfHGb-sBCTPBXpZbiY0kc69thGo8uHa0qmRe8AZTHFaq4Np0pbT9FEaj0EulMFNpPS-sZWnWBTsCO7KhTmgQ64Q");
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(header);
        System.out.println(jsonRequest);
    }

}
