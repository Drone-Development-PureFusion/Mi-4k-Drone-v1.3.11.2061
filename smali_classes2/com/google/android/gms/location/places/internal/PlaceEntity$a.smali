.class public Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/internal/PlaceEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/google/android/gms/maps/model/LatLng;

.field private e:F

.field private f:Lcom/google/android/gms/maps/model/LatLngBounds;

.field private g:Landroid/net/Uri;

.field private h:Z

.field private i:F

.field private j:I

.field private k:J

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->a:I

    return-void
.end method


# virtual methods
.method public a(F)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->e:F

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->j:I

    return-object p0
.end method

.method public a(J)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->k:J

    return-object p0
.end method

.method public a(Landroid/net/Uri;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->g:Landroid/net/Uri;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->d:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/google/android/gms/location/places/internal/PlaceEntity$a;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->l:Ljava/util/List;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->h:Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/location/places/internal/PlaceEntity;
    .locals 30

    new-instance v5, Lcom/google/android/gms/location/places/internal/PlaceEntity;

    const/4 v6, 0x0

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->l:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->c:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->m:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->n:Ljava/lang/String;

    const/4 v14, 0x0

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->o:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->d:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->e:F

    move/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->g:Landroid/net/Uri;

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->h:Z

    move/from16 v21, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->i:F

    move/from16 v22, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->j:I

    move/from16 v23, v0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->k:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->c:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->m:Ljava/lang/String;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->n:Ljava/lang/String;

    move-object/from16 v27, v0

    const/16 v28, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->o:Ljava/util/List;

    move-object/from16 v29, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    move-object/from16 v3, v29

    invoke-static {v4, v0, v1, v2, v3}, Lcom/google/android/gms/location/places/internal/PlaceLocalization;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/location/places/internal/PlaceLocalization;

    move-result-object v26

    invoke-direct/range {v5 .. v26}, Lcom/google/android/gms/location/places/internal/PlaceEntity;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/maps/model/LatLng;FLcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;Landroid/net/Uri;ZFIJLcom/google/android/gms/location/places/internal/PlaceLocalization;)V

    return-object v5
.end method

.method public b(F)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->i:F

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/location/places/internal/PlaceEntity$a;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->o:Ljava/util/List;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->m:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/location/places/internal/PlaceEntity$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceEntity$a;->n:Ljava/lang/String;

    return-object p0
.end method
