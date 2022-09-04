.class Lcom/fimi/soul/biz/k/d$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/k/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/k/d;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/k/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 10

    const-wide v0, 0x411e848000000000L    # 500000.0

    const/4 v2, 0x0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v3, p1, Landroid/os/Message;->what:I

    const/16 v4, 0x64

    if-eq v3, v4, :cond_0

    iget v3, p1, Landroid/os/Message;->what:I

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_1

    :cond_0
    :try_start_0
    iget-object v3, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v3}, Lcom/fimi/soul/biz/k/d;->a(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/maps/model/CameraPosition;->b:F

    const/high16 v4, 0x41000000    # 8.0f

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/d;->b(Lcom/fimi/soul/biz/k/d;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v3, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    iget-object v4, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v4}, Lcom/fimi/soul/biz/k/d;->c(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v5}, Lcom/fimi/soul/biz/k/d;->d(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/fimi/soul/biz/k/d;->a(Lcom/fimi/soul/biz/k/d;Ljava/util/List;Ljava/util/List;)V

    iget-object v3, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    iget-object v4, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v4}, Lcom/fimi/soul/biz/k/d;->e(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v5}, Lcom/fimi/soul/biz/k/d;->f(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/fimi/soul/biz/k/d;->a(Lcom/fimi/soul/biz/k/d;Ljava/util/List;Ljava/util/List;)V

    iget-object v3, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    iget-object v4, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v4}, Lcom/fimi/soul/biz/k/d;->g(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v5}, Lcom/fimi/soul/biz/k/d;->h(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/fimi/soul/biz/k/d;->a(Lcom/fimi/soul/biz/k/d;Ljava/util/List;Ljava/util/List;)V

    new-instance v3, Landroid/graphics/Point;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    iget-object v4, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v4}, Lcom/fimi/soul/biz/k/d;->a(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/maps/h;->a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v4}, Lcom/fimi/soul/biz/k/d;->a(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v4

    iget-object v6, v4, Lcom/google/android/gms/maps/model/CameraPosition;->a:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v6, :cond_1

    invoke-static {v3, v6}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v4

    const-wide v8, 0x40d3880000000000L    # 20000.0

    cmpg-double v3, v4, v8

    if-gez v3, :cond_3

    const-wide v4, 0x40e1170000000000L    # 35000.0

    :cond_3
    cmpl-double v3, v4, v0

    if-lez v3, :cond_e

    :goto_1
    const-wide v4, 0x40fb198000000000L    # 111000.0

    div-double v4, v0, v4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/d;->i(Lcom/fimi/soul/biz/k/d;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT LAT,LON,CLASS from dmz_tb where LAT > "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->a:D

    sub-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and LAT <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->a:D

    add-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and LON >"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->b:D

    sub-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and LON < "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->b:D

    add-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {}, Lcom/fimi/soul/base/DroidPlannerApp;->g()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->v()I

    move-result v1

    sget v3, Lcom/fimi/soul/entity/DeviceType;->DEVICE_4K:I

    if-ne v1, v3, :cond_5

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select LAT,LON,WarnRadius,NoFlyRadius,HLRadius from dmz_tbv10 where LAT> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->a:D

    sub-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and LAT <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->a:D

    add-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and LON >"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v8, v6, Lcom/google/android/gms/maps/model/LatLng;->b:D

    sub-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and LON < "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->b:D

    add-double/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_5
    iget-object v1, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/d;->i(Lcom/fimi/soul/biz/k/d;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_d

    :goto_2
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "LAT"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    float-to-double v6, v0

    const-string v0, "LON"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    float-to-double v8, v0

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {}, Lcom/fimi/soul/base/DroidPlannerApp;->g()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->v()I

    move-result v0

    sget v1, Lcom/fimi/soul/entity/DeviceType;->DEVICE_4K:I

    if-ne v0, v1, :cond_a

    :cond_6
    const-string v0, "NoFlyRadius"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    const-string v0, "WarnRadius"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const-string v1, "HLRadius"

    invoke-interface {v5, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v5, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    add-int/2addr v0, v3

    mul-int/lit8 v1, v0, 0xa

    mul-int/lit8 v0, v4, 0xa

    mul-int/lit8 v3, v3, 0xa

    add-int/lit16 v4, v0, 0x5dc

    move v4, v3

    move v3, v1

    move v1, v0

    :goto_3
    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-static {v6, v7, v8, v9}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v6

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v8

    invoke-virtual {v6}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v6

    invoke-direct {v0, v8, v9, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :goto_4
    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-static {}, Lcom/fimi/soul/base/DroidPlannerApp;->g()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fimi/kernel/utils/v;->v()I

    move-result v6

    sget v7, Lcom/fimi/soul/entity/DeviceType;->DEVICE_4K:I

    if-ne v6, v7, :cond_9

    :cond_7
    if-ge v4, v1, :cond_8

    :cond_8
    iget-object v1, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    iget-object v6, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v6}, Lcom/fimi/soul/biz/k/d;->j(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v6

    invoke-static {v1, v0, v3, v6}, Lcom/fimi/soul/biz/k/d;->a(Lcom/fimi/soul/biz/k/d;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    :cond_9
    iget-object v1, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    iget-object v3, p0, Lcom/fimi/soul/biz/k/d$1;->a:Lcom/fimi/soul/biz/k/d;

    invoke-static {v3}, Lcom/fimi/soul/biz/k/d;->k(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v3

    invoke-static {v1, v0, v4, v3}, Lcom/fimi/soul/biz/k/d;->b(Lcom/fimi/soul/biz/k/d;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    :cond_a
    :try_start_1
    const-string v0, "CLASS"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-byte v0, v0

    and-int/lit8 v1, v0, 0x3

    and-int/lit8 v1, v0, 0x3f

    const/16 v3, 0x1e

    if-ne v1, v3, :cond_b

    const/16 v0, 0x7f

    :goto_5
    add-int/lit8 v0, v0, 0x1

    mul-int/lit16 v0, v0, 0x3e8

    move v1, v2

    move v3, v2

    move v4, v0

    goto :goto_3

    :cond_b
    and-int/lit8 v0, v0, 0x3f

    goto :goto_5

    :cond_c
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_4

    :cond_d
    if-eqz v5, :cond_1

    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :cond_e
    move-wide v0, v4

    goto/16 :goto_1
.end method
