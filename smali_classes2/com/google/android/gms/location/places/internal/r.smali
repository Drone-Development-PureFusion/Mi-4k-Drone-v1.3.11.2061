.class public Lcom/google/android/gms/location/places/internal/r;
.super Lcom/google/android/gms/location/places/internal/t;

# interfaces
.implements Lcom/google/android/gms/location/places/d;


# instance fields
.field private final bx:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/t;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    const-string v0, "place_id"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/r;->bx:Ljava/lang/String;

    return-void
.end method

.method private s()Lcom/google/android/gms/location/places/internal/PlaceEntity;
    .locals 4

    new-instance v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->e()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->c(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/r;->t()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->b(Ljava/util/List;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->q()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(Z)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->h()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->p()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(F)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->g()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->b(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->k()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->d(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(I)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->l()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->b(F)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(Ljava/util/List;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->i()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->j()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(Landroid/net/Uri;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->r()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a(J)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a()Lcom/google/android/gms/location/places/internal/PlaceEntity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->f()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceEntity;->a(Ljava/util/Locale;)V

    return-object v0
.end method

.method private t()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "place_attributions"

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/r;->o()Lcom/google/android/gms/location/places/d;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/r;->bx:Ljava/lang/String;

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

    const-string v0, "place_types"

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "place_address"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Locale;
    .locals 3

    const-string v0, "place_locale_language"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "place_locale_country"

    const-string v2, ""

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "place_locale"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/Locale;

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "place_name"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Lcom/google/android/gms/maps/model/LatLng;
    .locals 2

    const-string v0, "place_lat_lng"

    sget-object v1, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Lcom/google/android/gms/maps/model/r;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public i()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 2

    const-string v0, "place_viewport"

    sget-object v1, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Lcom/google/android/gms/maps/model/q;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object v0
.end method

.method public j()Landroid/net/Uri;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "place_website_uri"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public k()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "place_phone_number"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()F
    .locals 2

    const-string v0, "place_rating"

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public m()I
    .locals 2

    const-string v0, "place_price_level"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public n()Ljava/lang/CharSequence;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/r;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/location/places/internal/c;->a(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o()Lcom/google/android/gms/location/places/d;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/r;->s()Lcom/google/android/gms/location/places/internal/PlaceEntity;

    move-result-object v0

    return-object v0
.end method

.method public p()F
    .locals 2

    const-string v0, "place_level_number"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public q()Z
    .locals 2

    const-string v0, "place_is_permanently_closed"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public r()J
    .locals 4

    const-string v0, "place_timestamp_secs"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lcom/google/android/gms/location/places/internal/r;->a(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method
