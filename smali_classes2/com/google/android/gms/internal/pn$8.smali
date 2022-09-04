.class final Lcom/google/android/gms/internal/pn$8;
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
        "Ljava/util/Calendar;",
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
.method public a(Lcom/google/android/gms/internal/pp;)Ljava/util/Calendar;
    .locals 9

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pq;->i:Lcom/google/android/gms/internal/pq;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->c()V

    move v5, v6

    move v4, v6

    move v3, v6

    move v2, v6

    move v1, v6

    :cond_1
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v7, Lcom/google/android/gms/internal/pq;->d:Lcom/google/android/gms/internal/pq;

    if-eq v0, v7, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->m()I

    move-result v0

    const-string v8, "year"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move v1, v0

    goto :goto_1

    :cond_2
    const-string v8, "month"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v2, v0

    goto :goto_1

    :cond_3
    const-string v8, "dayOfMonth"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v3, v0

    goto :goto_1

    :cond_4
    const-string v8, "hourOfDay"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v4, v0

    goto :goto_1

    :cond_5
    const-string v8, "minute"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v5, v0

    goto :goto_1

    :cond_6
    const-string v8, "second"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v6, v0

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->d()V

    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct/range {v0 .. v6}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Calendar;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pn$8;->a(Lcom/google/android/gms/internal/ps;Ljava/util/Calendar;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ps;Ljava/util/Calendar;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->d()Lcom/google/android/gms/internal/ps;

    const-string v0, "year"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ps;->a(J)Lcom/google/android/gms/internal/ps;

    const-string v0, "month"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ps;->a(J)Lcom/google/android/gms/internal/ps;

    const-string v0, "dayOfMonth"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ps;->a(J)Lcom/google/android/gms/internal/ps;

    const-string v0, "hourOfDay"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    const/16 v0, 0xb

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ps;->a(J)Lcom/google/android/gms/internal/ps;

    const-string v0, "minute"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    const/16 v0, 0xc

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ps;->a(J)Lcom/google/android/gms/internal/ps;

    const-string v0, "second"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    const/16 v0, 0xd

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ps;->a(J)Lcom/google/android/gms/internal/ps;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->e()Lcom/google/android/gms/internal/ps;

    goto :goto_0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pn$8;->a(Lcom/google/android/gms/internal/pp;)Ljava/util/Calendar;

    move-result-object v0

    return-object v0
.end method
