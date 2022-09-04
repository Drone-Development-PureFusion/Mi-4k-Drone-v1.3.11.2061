.class final Lcom/google/android/gms/internal/pn$10;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/pn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Lcom/google/android/gms/internal/nx;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Lcom/google/android/gms/internal/nx;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/pn$19;->a:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/pq;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/od;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0

    :pswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/od;

    new-instance v2, Lcom/google/android/gms/internal/ov;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ov;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/Number;)V

    goto :goto_0

    :pswitch_2
    new-instance v0, Lcom/google/android/gms/internal/od;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/Boolean;)V

    goto :goto_0

    :pswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    sget-object v0, Lcom/google/android/gms/internal/nz;->a:Lcom/google/android/gms/internal/nz;

    goto :goto_0

    :pswitch_4
    new-instance v1, Lcom/google/android/gms/internal/nu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/nu;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->a()V

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pn$10;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/nu;->a(Lcom/google/android/gms/internal/nx;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->b()V

    move-object v0, v1

    goto :goto_0

    :pswitch_5
    new-instance v1, Lcom/google/android/gms/internal/oa;

    invoke-direct {v1}, Lcom/google/android/gms/internal/oa;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->c()V

    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pn$10;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nx;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->d()V

    move-object v0, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public a(Lcom/google/android/gms/internal/ps;Lcom/google/android/gms/internal/nx;)V
    .locals 4

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/nx;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/nx;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/nx;->n()Lcom/google/android/gms/internal/od;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->p()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/Number;)Lcom/google/android/gms/internal/ps;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->g()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Z)Lcom/google/android/gms/internal/ps;

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    goto :goto_0

    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/nx;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->b()Lcom/google/android/gms/internal/ps;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/nx;->m()Lcom/google/android/gms/internal/nu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nu;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pn$10;->a(Lcom/google/android/gms/internal/ps;Lcom/google/android/gms/internal/nx;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->c()Lcom/google/android/gms/internal/ps;

    goto :goto_0

    :cond_6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/nx;->i()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->d()Lcom/google/android/gms/internal/ps;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/nx;->l()Lcom/google/android/gms/internal/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/oa;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pn$10;->a(Lcom/google/android/gms/internal/ps;Lcom/google/android/gms/internal/nx;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->e()Lcom/google/android/gms/internal/ps;

    goto/16 :goto_0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xf

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Couldn\'t write "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/android/gms/internal/nx;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pn$10;->a(Lcom/google/android/gms/internal/ps;Lcom/google/android/gms/internal/nx;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pn$10;->a(Lcom/google/android/gms/internal/pp;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    return-object v0
.end method
