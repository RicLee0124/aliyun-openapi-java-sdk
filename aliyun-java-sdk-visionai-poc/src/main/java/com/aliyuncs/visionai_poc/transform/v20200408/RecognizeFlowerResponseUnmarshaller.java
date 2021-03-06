/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.visionai_poc.transform.v20200408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.visionai_poc.model.v20200408.RecognizeFlowerResponse;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeFlowerResponse.Response;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeFlowerResponse.Response.Data;
import com.aliyuncs.visionai_poc.model.v20200408.RecognizeFlowerResponse.Response.Data.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeFlowerResponseUnmarshaller {

	public static RecognizeFlowerResponse unmarshall(RecognizeFlowerResponse recognizeFlowerResponse, UnmarshallerContext _ctx) {
		
		recognizeFlowerResponse.setCode(_ctx.integerValue("RecognizeFlowerResponse.Code"));
		recognizeFlowerResponse.setMessage(_ctx.stringValue("RecognizeFlowerResponse.Message"));
		recognizeFlowerResponse.setSuccess(_ctx.booleanValue("RecognizeFlowerResponse.Success"));

		Response response = new Response();
		response.setSuccess(_ctx.booleanValue("RecognizeFlowerResponse.Response.Success"));
		response.setUrl(_ctx.stringValue("RecognizeFlowerResponse.Response.Url"));
		response.setRequestId(_ctx.stringValue("RecognizeFlowerResponse.Response.RequestId"));
		response.setErrorCode(_ctx.stringValue("RecognizeFlowerResponse.Response.ErrorCode"));
		response.setErrorMessage(_ctx.stringValue("RecognizeFlowerResponse.Response.ErrorMessage"));

		Data data = new Data();
		data.setExternal(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.External"));
		data.setConfidence(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Confidence"));
		data.setRoid(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Roid"));
		data.setVersion(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Version"));
		data.setTips(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Tips"));
		data.setModelName(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.ModelName"));
		data.setProp(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Prop"));
		data.setName(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Name"));
		data.setPicUrl(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.PicUrl"));
		data.setSptId(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.SptId"));
		data.setDescription(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Description"));
		data.setPredictRes(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.PredictRes"));

		List<Node> predictability = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFlowerResponse.Response.Data.Predictability.Length"); i++) {
			Node node = new Node();
			node.setScore(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Predictability["+ i +"].Score"));
			node.setTag(_ctx.stringValue("RecognizeFlowerResponse.Response.Data.Predictability["+ i +"].Tag"));

			predictability.add(node);
		}
		data.setPredictability(predictability);
		response.setData(data);
		recognizeFlowerResponse.setResponse(response);
	 
	 	return recognizeFlowerResponse;
	}
}