.class public Lcom/google/android/gms/internal/hz;
.super Lcom/google/android/gms/internal/ie;


# instance fields
.field private final b:Lcom/google/android/gms/internal/im;

.field private final c:Lcom/google/firebase/database/a;

.field private final d:Lcom/google/android/gms/internal/kg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/a;Lcom/google/android/gms/internal/kg;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ie;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/hz;->d:Lcom/google/android/gms/internal/kg;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/ie;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/hz;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/im;

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/hz;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/a;Lcom/google/android/gms/internal/kg;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kb;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/im;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/firebase/database/e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/s;->a(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lc;)Lcom/google/firebase/database/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/kb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v3

    invoke-direct {v2, v3, p0, v1, v0}, Lcom/google/android/gms/internal/kb;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/b;Ljava/lang/String;)V

    return-object v2

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/internal/kg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->d:Lcom/google/android/gms/internal/kg;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kb;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hz;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/hz$1;->a:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->e()Lcom/google/android/gms/internal/kc$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->c()Lcom/google/firebase/database/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/database/a;->a(Lcom/google/firebase/database/b;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->c()Lcom/google/firebase/database/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/database/a;->b(Lcom/google/firebase/database/b;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->c()Lcom/google/firebase/database/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/database/a;->c(Lcom/google/firebase/database/b;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->c()Lcom/google/firebase/database/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/database/a;->a(Lcom/google/firebase/database/b;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public a(Lcom/google/firebase/database/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/a;->a(Lcom/google/firebase/database/c;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ie;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/hz;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/hz;

    iget-object v0, p1, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kc$a;)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/hz;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/hz;

    iget-object v0, v0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/hz;

    iget-object v0, v0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/im;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/hz;

    iget-object v0, p1, Lcom/google/android/gms/internal/hz;->d:Lcom/google/android/gms/internal/kg;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->d:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/firebase/database/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/im;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->d:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ChildEventRegistration"

    return-object v0
.end method
