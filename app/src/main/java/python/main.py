import requests
from android.os import Handler, Looper
from com.chaquo.python import Python

def fetch_url(url):
    api_url = "https://tera.backend.live/allinone"
    headers = {
        "x-api-key": "pxrAEVHPV2S0yczPyv9bE9n8JryVwJAw",
        "content-type": "application/json; charset=utf-8",
        "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
    }
    payload = {"url": url}

    try:
        response = requests.post(api_url, headers=headers, json=payload)
        return response.text
    except Exception as e:
        return f"❌ Error: {str(e)}"
