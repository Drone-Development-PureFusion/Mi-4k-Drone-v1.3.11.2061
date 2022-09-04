.class public final Lcom/google/android/gms/plus/internal/model/people/PersonEntity;
.super Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;

# interfaces
.implements Lcom/google/android/gms/plus/a/a/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity;,
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity;,
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity;,
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;,
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;,
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;,
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;,
        Lcom/google/android/gms/plus/internal/model/people/PersonEntity$a;
    }
.end annotation


# static fields
.field private static final A:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/server/response/FastJsonResponse$Field",
            "<**>;>;"
        }
    .end annotation
.end field

.field public static final CREATOR:Lcom/google/android/gms/plus/internal/model/people/a;


# instance fields
.field final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final b:I

.field c:Ljava/lang/String;

.field d:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:I

.field h:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:I

.field l:Ljava/lang/String;

.field m:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

.field n:Z

.field o:Ljava/lang/String;

.field p:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;

.field q:Ljava/lang/String;

.field r:I

.field s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity;",
            ">;"
        }
    .end annotation
.end field

.field t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity;",
            ">;"
        }
    .end annotation
.end field

.field u:I

.field v:I

.field w:Ljava/lang/String;

.field x:Ljava/lang/String;

.field y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity;",
            ">;"
        }
    .end annotation
.end field

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/4 v10, 0x4

    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    new-instance v0, Lcom/google/android/gms/plus/internal/model/people/a;

    invoke-direct {v0}, Lcom/google/android/gms/plus/internal/model/people/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->CREATOR:Lcom/google/android/gms/plus/internal/model/people/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "aboutMe"

    const-string v2, "aboutMe"

    invoke-static {v2, v8}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "ageRange"

    const-string v2, "ageRange"

    const-class v3, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;

    invoke-static {v2, v9, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "birthday"

    const-string v2, "birthday"

    invoke-static {v2, v10}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "braggingRights"

    const-string v2, "braggingRights"

    const/4 v3, 0x5

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "circledByCount"

    const-string v2, "circledByCount"

    const/4 v3, 0x6

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "cover"

    const-string v2, "cover"

    const/4 v3, 0x7

    const-class v4, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "currentLocation"

    const-string v2, "currentLocation"

    const/16 v3, 0x8

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "displayName"

    const-string v2, "displayName"

    const/16 v3, 0x9

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "gender"

    const-string v2, "gender"

    const/16 v3, 0xc

    new-instance v4, Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    invoke-direct {v4}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;-><init>()V

    const-string v5, "male"

    invoke-virtual {v4, v5, v7}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "female"

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "other"

    invoke-virtual {v4, v5, v8}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    invoke-static {v2, v3, v4, v7}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;ILcom/google/android/gms/common/server/response/FastJsonResponse$a;Z)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "id"

    const-string v2, "id"

    const/16 v3, 0xe

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "image"

    const-string v2, "image"

    const/16 v3, 0xf

    const-class v4, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "isPlusUser"

    const-string v2, "isPlusUser"

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->b(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "language"

    const-string v2, "language"

    const/16 v3, 0x12

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "name"

    const-string v2, "name"

    const/16 v3, 0x13

    const-class v4, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "nickname"

    const-string v2, "nickname"

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "objectType"

    const-string v2, "objectType"

    const/16 v3, 0x15

    new-instance v4, Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    invoke-direct {v4}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;-><init>()V

    const-string v5, "person"

    invoke-virtual {v4, v5, v7}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "page"

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    invoke-static {v2, v3, v4, v7}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;ILcom/google/android/gms/common/server/response/FastJsonResponse$a;Z)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "organizations"

    const-string v2, "organizations"

    const/16 v3, 0x16

    const-class v4, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "placesLived"

    const-string v2, "placesLived"

    const/16 v3, 0x17

    const-class v4, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "plusOneCount"

    const-string v2, "plusOneCount"

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "relationshipStatus"

    const-string v2, "relationshipStatus"

    const/16 v3, 0x19

    new-instance v4, Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    invoke-direct {v4}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;-><init>()V

    const-string v5, "single"

    invoke-virtual {v4, v5, v7}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "in_a_relationship"

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "engaged"

    invoke-virtual {v4, v5, v8}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "married"

    invoke-virtual {v4, v5, v9}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "its_complicated"

    invoke-virtual {v4, v5, v10}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "open_relationship"

    const/4 v6, 0x5

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "widowed"

    const/4 v6, 0x6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "in_domestic_partnership"

    const/4 v6, 0x7

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    const-string v5, "in_civil_union"

    const/16 v6, 0x8

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->a(Ljava/lang/String;I)Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    move-result-object v4

    invoke-static {v2, v3, v4, v7}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->a(Ljava/lang/String;ILcom/google/android/gms/common/server/response/FastJsonResponse$a;Z)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "tagline"

    const-string v2, "tagline"

    const/16 v3, 0x1a

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "url"

    const-string v2, "url"

    const/16 v3, 0x1b

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->c(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "urls"

    const-string v2, "urls"

    const/16 v3, 0x1c

    const-class v4, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    const-string v1, "verified"

    const-string v2, "verified"

    const/16 v3, 0x1d

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->b(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->b:I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;ILjava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->b:I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->j:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iput-object p2, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->l:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iput-object p3, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->m:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iput p4, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->r:I

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iput-object p5, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->x:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method constructor <init>(Ljava/util/Set;ILjava/lang/String;Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;ZLjava/lang/String;Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;Ljava/lang/String;ILjava/util/List;Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity;",
            ">;II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    iput p2, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->b:I

    iput-object p3, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->d:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;

    iput-object p5, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->f:Ljava/lang/String;

    iput p7, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->g:I

    iput-object p8, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->h:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;

    iput-object p9, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->i:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->j:Ljava/lang/String;

    iput p11, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->k:I

    iput-object p12, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->l:Ljava/lang/String;

    iput-object p13, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->m:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

    iput-boolean p14, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->n:Z

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->o:Ljava/lang/String;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->p:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->q:Ljava/lang/String;

    move/from16 v0, p18

    iput v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->r:I

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->s:Ljava/util/List;

    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->t:Ljava/util/List;

    move/from16 v0, p21

    iput v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->u:I

    move/from16 v0, p22

    iput v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->v:I

    move-object/from16 v0, p23

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->w:Ljava/lang/String;

    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->x:Ljava/lang/String;

    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->y:Ljava/util/List;

    move/from16 v0, p26

    iput-boolean v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->z:Z

    return-void
.end method

.method public static a([B)Lcom/google/android/gms/plus/internal/model/people/PersonEntity;
    .locals 3

    const/4 v2, 0x0

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    array-length v0, p0

    invoke-virtual {v1, p0, v2, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->CREATOR:Lcom/google/android/gms/plus/internal/model/people/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/plus/internal/model/people/a;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method


# virtual methods
.method public A()Lcom/google/android/gms/plus/a/a/a$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->m:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

    return-object v0
.end method

.method public B()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->n:Z

    return v0
.end method

.method public D()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->o:Ljava/lang/String;

    return-object v0
.end method

.method public F()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public G()Lcom/google/android/gms/plus/a/a/a$e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->p:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;

    return-object v0
.end method

.method public H()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x13

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->q:Ljava/lang/String;

    return-object v0
.end method

.method public J()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public K()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->r:I

    return v0
.end method

.method public L()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public M()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/a/a/a$g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->s:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public N()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public O()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/a/a/a$h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->t:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public P()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public Q()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->u:I

    return v0
.end method

.method public R()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public S()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->v:I

    return v0
.end method

.method public T()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->w:Ljava/lang/String;

    return-object v0
.end method

.method public V()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public W()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->x:Ljava/lang/String;

    return-object v0
.end method

.method public X()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public Y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/a/a/a$j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->y:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public Z()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->ac()Lcom/google/android/gms/plus/internal/model/people/PersonEntity;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public aa()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->z:Z

    return v0
.end method

.method public ab()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public ac()Lcom/google/android/gms/plus/internal/model/people/PersonEntity;
    .locals 0

    return-object p0
.end method

.method protected b(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->g()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x26

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown safe parcelable id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->c:Ljava/lang/String;

    :goto_0
    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->d:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->e:Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->f:Ljava/lang/String;

    goto :goto_0

    :pswitch_5
    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->h:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->i:Ljava/lang/String;

    goto :goto_0

    :pswitch_8
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->j:Ljava/lang/String;

    goto :goto_0

    :pswitch_9
    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->k:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_a
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->l:Ljava/lang/String;

    goto :goto_0

    :pswitch_b
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->m:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

    goto :goto_0

    :pswitch_c
    iget-boolean v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->n:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :pswitch_d
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->o:Ljava/lang/String;

    goto :goto_0

    :pswitch_e
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->p:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;

    goto :goto_0

    :pswitch_f
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->q:Ljava/lang/String;

    goto :goto_0

    :pswitch_10
    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->r:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_11
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->s:Ljava/util/List;

    goto :goto_0

    :pswitch_12
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->t:Ljava/util/List;

    goto :goto_0

    :pswitch_13
    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->u:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_14
    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->v:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_15
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->w:Ljava/lang/String;

    goto :goto_0

    :pswitch_16
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->x:Ljava/lang/String;

    goto :goto_0

    :pswitch_17
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->y:Ljava/util/List;

    goto :goto_0

    :pswitch_18
    iget-boolean v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->z:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_0
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
    .end packed-switch
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public synthetic c()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->f()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    instance-of v0, p1, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    if-ne p0, p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->b(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->b(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    invoke-virtual {p1, v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_0
.end method

.method public f()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/server/response/FastJsonResponse$Field",
            "<**>;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->c:Ljava/lang/String;

    return-object v0
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x0

    sget-object v1, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->A:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->g()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->b(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public i()Lcom/google/android/gms/plus/a/a/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->d:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;

    return-object v0
.end method

.method public j()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->e:Ljava/lang/String;

    return-object v0
.end method

.method public l()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->f:Ljava/lang/String;

    return-object v0
.end method

.method public n()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->g:I

    return v0
.end method

.method public p()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public q()Lcom/google/android/gms/plus/a/a/a$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->h:Lcom/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;

    return-object v0
.end method

.method public r()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->i:Ljava/lang/String;

    return-object v0
.end method

.method public t()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->j:Ljava/lang/String;

    return-object v0
.end method

.method public v()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public w()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->k:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->CREATOR:Lcom/google/android/gms/plus/internal/model/people/a;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/plus/internal/model/people/a;->a(Lcom/google/android/gms/plus/internal/model/people/PersonEntity;Landroid/os/Parcel;I)V

    return-void
.end method

.method public x()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->l:Ljava/lang/String;

    return-object v0
.end method

.method public z()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->a:Ljava/util/Set;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
