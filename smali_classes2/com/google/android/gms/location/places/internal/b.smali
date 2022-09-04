.class public Lcom/google/android/gms/location/places/internal/b;
.super Lcom/google/android/gms/location/places/internal/t;

# interfaces
.implements Lcom/google/android/gms/location/places/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/t;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-void
.end method

.method private g()Ljava/lang/String;
    .locals 2

    const-string v0, "ap_description"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private h()Ljava/lang/String;
    .locals 2

    const-string v0, "ap_primary_text"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private i()Ljava/lang/String;
    .locals 2

    const-string v0, "ap_secondary_text"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private j()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity$SubstringEntity;",
            ">;"
        }
    .end annotation

    const-string v0, "ap_matched_subscriptions"

    sget-object v1, Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity$SubstringEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private k()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity$SubstringEntity;",
            ">;"
        }
    .end annotation

    const-string v0, "ap_primary_text_matched"

    sget-object v1, Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity$SubstringEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private l()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity$SubstringEntity;",
            ">;"
        }
    .end annotation

    const-string v0, "ap_secondary_text_matched"

    sget-object v1, Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity$SubstringEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/text/style/CharacterStyle;)Ljava/lang/CharSequence;
    .locals 2
    .param p1    # Landroid/text/style/CharacterStyle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->j()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/location/places/internal/c;->a(Ljava/lang/String;Ljava/util/List;Landroid/text/style/CharacterStyle;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/b;->e()Lcom/google/android/gms/location/places/a;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/text/style/CharacterStyle;)Ljava/lang/CharSequence;
    .locals 2
    .param p1    # Landroid/text/style/CharacterStyle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->k()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/location/places/internal/c;->a(Ljava/lang/String;Ljava/util/List;Landroid/text/style/CharacterStyle;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/text/style/CharacterStyle;)Ljava/lang/CharSequence;
    .locals 2
    .param p1    # Landroid/text/style/CharacterStyle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/location/places/internal/c;->a(Ljava/lang/String;Ljava/util/List;Landroid/text/style/CharacterStyle;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    const-string v0, "ap_place_id"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "ap_place_types"

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/google/android/gms/location/places/a;
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/b;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/b;->f()I

    move-result v2

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->g()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->j()Ljava/util/List;

    move-result-object v4

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->h()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->k()Ljava/util/List;

    move-result-object v6

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->i()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/b;->l()Ljava/util/List;

    move-result-object v8

    invoke-static/range {v0 .. v8}, Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity;->a(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/location/places/internal/AutocompletePredictionEntity;

    move-result-object v0

    return-object v0
.end method

.method public f()I
    .locals 2

    const-string v0, "ap_personalization_type"

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/b;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method
